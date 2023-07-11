SUMMARY = "Audio Recording App"
DESCRIPTION = "An audio recording app designed for elementary OS."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.1"

RPM_NAME = "reco-3.2.1-1.8.aarch64.rpm"
RPM_HASH = "082d892d3ea7eea562a4d9001f5b3d20fb05bc1c706270e12cccda354fe1c9cc45ba1aaf8b1d2123a0cad80395af87396f6f3cbcba3676522a11f43fca9f74a1"

RPROVIDES:${PN} += "reco"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0 \
libhandy-1.so.0 \
libpulse-mainloop-glib.so.0 \
libpulse.so.0"

inherit rpm
