SUMMARY = "Chromaprint plugin for GStreamer"
DESCRIPTION = "Add chromaprint (Audio Fingerprinting) support to any GStreamer based tool."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "gstreamer-plugins-bad-chromaprint-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "7c7768f999630c196e2501d5478609e63ba59fdb2a9a9d0099bfb6516ec36e9919b6949713eacc44968bae9368354944a6e50a98ba56eb1e1ae8feb3d595e047"

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
