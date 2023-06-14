SUMMARY = "Library for clapper"
DESCRIPTION = "Library for clapper."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.2"

RPM_NAME = "libgstclapper-1_0-0-0.5.2-1.3.aarch64.rpm"
RPM_HASH = "d210fbe35bfe041faec9c4cfbbfb86f05e4b475b408ed2f4cd3930b24469ecf14b85c1688028c77644cfd60ce440bc49e264beaf86d0ef23fdec17ca5961ed2d"

RPROVIDES:${PN} += "libgstclapper-1 \
libgstclapper-1-0-0 \
libgstclapper-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGLESv2.so.2 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstaudio-1.0.so.0 \
libgstgl-1.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgsttag-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgtk-4.so.1"

inherit rpm
