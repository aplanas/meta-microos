SUMMARY = "The Weston compositor as a shared library"
DESCRIPTION = "The libweston library is intended for use by other compositor efforts \
(projects) that want to more easily utilize Weston's internal \
functionalities. Weston's own reference compositor also makes use of \
this."
LICENSE = "CC-BY-SA-3.0 & MIT"

PV = "12.0.1"

RPM_NAME = "libweston-12-0-12.0.1-1.1.aarch64.rpm"
RPM_HASH = "146321aa8e14862ea1c0b23c000b101602e4cb21776b6581d89d2eee451155e6de8a4f08d6987bb7e289aaa2813a8177caecbfd491388ef049059e06e0e2e6c4"

RPROVIDES:${PN} += "libweston-12-0 \
libweston-12-0(aarch-64) \
libweston-12.so.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libdrm.so.2()(64bit) \
libpixman-1.so.0()(64bit) \
libwayland-server.so.0()(64bit) \
libweston-12 \
libxkbcommon.so.0()(64bit)"

inherit rpm
