SUMMARY = "Development files for argtable, a command line parsing library"
DESCRIPTION = "The libargtable2-devel package contains libraries and header files for \
developing applications that use libargtable."
LICENSE = "LGPL-2.0+"

PV = "2.13"

RPM_NAME = "libargtable2-devel-2.13-2.24.aarch64.rpm"
RPM_HASH = "403e4ad8c17b5741032c9411fde5b13829ac0fe1db6e6cd6bb7f568a7e3cdc21ab89f167e8507a195395fa6aa39f995b3737a509d22167e9265d72f12564afda"

RPROVIDES:${PN} += "libargtable2-devel \
pkgconfig-argtable2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libargtable2-0"

inherit rpm
