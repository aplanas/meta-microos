SUMMARY = "The libmpd package"
DESCRIPTION = "libmpd is a library that provides high-level, callback-based access to Music \
Player Daemon."
LICENSE = "GPL-2.0+"

PV = "11.8.17"

RPM_NAME = "libmpd1-11.8.17-1.28.aarch64.rpm"
RPM_HASH = "fd79f27faec63ca6ba1e807306d14f099c21d9903c34041b26bb7fd63a1f5c657eb0d19dd8c301657ee1ba1c01bc1879947c851e89cfe44aac670164decc0a3d"

RPROVIDES:${PN} += "libmpd.so.1()(64bit) \
libmpd1 \
libmpd1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libglib-2.0.so.0()(64bit)"

inherit rpm
