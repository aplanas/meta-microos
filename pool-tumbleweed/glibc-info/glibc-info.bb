SUMMARY = "Info Files for the GNU C Library"
DESCRIPTION = "This package contains the documentation for the GNU C library stored as \
info files. Due to a lack of resources, this documentation is not \
complete and is partially out of date."
LICENSE = "GFDL-1.1-only"

PV = "2.38"

RPM_NAME = "glibc-info-2.38-2.1.noarch.rpm"
RPM_HASH = "ffc0e5ca4a875d150619bb3a1147d93f332027f308c92d5e9c9a22edee28acbc11fcb9239c81f26539e0088b5b9e3b320066977156a3a98108c897b6122601fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glibc-info"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
