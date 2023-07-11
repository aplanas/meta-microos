SUMMARY = "Development files for libmaia"
DESCRIPTION = "The libmaia-devel package contains libraries and header files for \
developing applications that use libmaia."
LICENSE = "BSD-2-Clause"

PV = "0.9.0"

RPM_NAME = "libmaia-devel-0.9.0-1.26.aarch64.rpm"
RPM_HASH = "ba7080b7e66fd3543c112e9b26d2aa7a1ad9f18755c40a52b5e0687bf7363b2d7996745d706a672093381309d57b52b806b19b74d50e26f38099ccc442d916cd"

RPROVIDES:${PN} += "libmaia-devel \
pkgconfig-maia"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmaia1"

inherit rpm
