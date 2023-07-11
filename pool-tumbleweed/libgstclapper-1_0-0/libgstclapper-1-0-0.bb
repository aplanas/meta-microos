SUMMARY = "Library for clapper"
DESCRIPTION = "Library for clapper."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.2"

RPM_NAME = "libgstclapper-1_0-0-0.5.2-1.4.aarch64.rpm"
RPM_HASH = "218446932acfdec1c7b01ef3139767c93005458dd72bde6bbe23b4efcefc57d31cc7411681a72223684eb58ee63e1bc0c96975902353270716997fe4e28656a9"

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
