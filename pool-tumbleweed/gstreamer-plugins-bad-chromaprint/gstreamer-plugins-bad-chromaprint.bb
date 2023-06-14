SUMMARY = "Chromaprint plugin for GStreamer"
DESCRIPTION = "Add chromaprint (Audio Fingerprinting) support to any GStreamer based tool."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "gstreamer-plugins-bad-chromaprint-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "4165271e6e250db40e17bfd6eb7c0cd91bc2f34fe0f1e3cb3674f61ec4ce9c384e43b2a5ae2816bcb43c86140de9847f9b4331b732646c5c69d2d40792944b6f"

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
