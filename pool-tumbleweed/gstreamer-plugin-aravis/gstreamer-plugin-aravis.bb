SUMMARY = "Gstreamer support for aravis"
DESCRIPTION = "This package contains the gstreamer plugin for aravis."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.27"

RPM_NAME = "gstreamer-plugin-aravis-0.8.27-1.1.aarch64.rpm"
RPM_HASH = "ebd6beab22cbf3273a3da5b6246d98284e4f31645e4701e132298c1d964a3545b4dd2ded96b4fcb3668f212db321c9d155b7c6d7b8da961275fb5dba6b5a0281"

RPROVIDES:${PN} += "gstreamer-plugin-aravis \
gstreamer1 \
libgstaravis.0.8.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaravis-0.8.so.0 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
