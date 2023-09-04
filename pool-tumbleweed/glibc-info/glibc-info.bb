SUMMARY = "Info Files for the GNU C Library"
DESCRIPTION = "This package contains the documentation for the GNU C library stored as \
info files. Due to a lack of resources, this documentation is not \
complete and is partially out of date."
LICENSE = "GFDL-1.1-only"

PV = "2.38"

RPM_NAME = "glibc-info-2.38-1.1.noarch.rpm"
RPM_HASH = "b0b20b85df08668cfffdbbae5ce77e7424184197aaeb9aa681e336d60746b71c20bd31e7ccd806793e1b7a5801c21e920226adf1b8c18511f04b00155c8b7add"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glibc-info"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
