SUMMARY = "Development files for libancient"
DESCRIPTION = "This subpackage contains libraries and header files for developing \
applications that want to make use of libancient."
LICENSE = "BSD-2-Clause"

PV = "2.0.0"

RPM_NAME = "ancient-devel-2.0.0-1.3.aarch64.rpm"
RPM_HASH = "f78cd1c60983083385dc57d8c8cbbb2ebef95c6de888abec8ce8ff48a49a5499c3fbdcca69c3dff77d0ea0a3bd4a0d2add0920fd77df22f87e9d7564ab3fb6e4"

RPROVIDES:${PN} += "ancient-devel \
ancient-devel(aarch-64) \
pkgconfig(libancient)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libancient2"

inherit rpm
