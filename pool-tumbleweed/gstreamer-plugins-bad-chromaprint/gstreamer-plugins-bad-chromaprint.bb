SUMMARY = "Chromaprint plugin for GStreamer"
DESCRIPTION = "Add chromaprint (Audio Fingerprinting) support to any GStreamer based tool."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "gstreamer-plugins-bad-chromaprint-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "d83b03e9505a66118525009e5439b3105c066d8568bb16fc523c09338d2ffe1eb318aeba9cb5cab8d716f7c58dbc3b375f02e56ca5206d08a7dbf0c20624245d"

RPROVIDES:${PN} += "gstreamer-plugins-bad-chromaprint \
gstreamer1 \
libgstchromaprint.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libchromaprint.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstaudio-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
