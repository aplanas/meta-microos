SUMMARY = "Info Files for the GNU C Library"
DESCRIPTION = "This package contains the documentation for the GNU C library stored as \
info files. Due to a lack of resources, this documentation is not \
complete and is partially out of date."
LICENSE = "GFDL-1.1-only"

PV = "2.37"

RPM_NAME = "glibc-info-2.37-5.1.noarch.rpm"
RPM_HASH = "ab7e37384646860cf87c744614026353fa9bf5bf33bcb0bb5a852abc6f3a9cbc8511b244dfae20bf37ea55860712bdd432637bcef95883ff31e866f7befc5833"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glibc-info"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
