SUMMARY = "Library for clapper"
DESCRIPTION = "Library for clapper."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.2"

RPM_NAME = "libgstclapper-1_0-0-0.5.2-1.3.aarch64.rpm"
RPM_HASH = "d210fbe35bfe041faec9c4cfbbfb86f05e4b475b408ed2f4cd3930b24469ecf14b85c1688028c77644cfd60ce440bc49e264beaf86d0ef23fdec17ca5961ed2d"

RPROVIDES:${PN} += "libgstclapper-1 \
libgstclapper-1.0.so.0()(64bit) \
libgstclapper-1_0-0 \
libgstclapper-1_0-0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGLESv2.so.2()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstaudio-1.0.so.0()(64bit) \
libgstgl-1.0.so.0()(64bit) \
libgstpbutils-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgsttag-1.0.so.0()(64bit) \
libgstvideo-1.0.so.0()(64bit) \
libgtk-4.so.1()(64bit)"

inherit rpm
