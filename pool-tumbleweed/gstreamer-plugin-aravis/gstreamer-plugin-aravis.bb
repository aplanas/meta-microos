SUMMARY = "Gstreamer support for aravis"
DESCRIPTION = "This package contains the gstreamer plugin for aravis."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.26"

RPM_NAME = "gstreamer-plugin-aravis-0.8.26-1.1.aarch64.rpm"
RPM_HASH = "1db753ca1aba3b36d94c465e6f5657d9ee68c0c75367dfe9fcc599b541869db86b8f308a2d7eb8ce018ca4db2dc3c992a104e4ff0f3f4cdfe81f6cc6ca4477b5"

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
