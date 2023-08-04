SUMMARY = "Chromaprint plugin for GStreamer"
DESCRIPTION = "Add chromaprint (Audio Fingerprinting) support to any GStreamer based tool."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "gstreamer-plugins-bad-chromaprint-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "74c038cf3af9cea3bc58badb6de47ddcbaa8c62f88b8d8c4570c44e9397a39e4012c9f6ba1c8aaea2c0c6bdf55a2f1c3b69c0a9e68c64dedce59b223c33dd1e3"

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
