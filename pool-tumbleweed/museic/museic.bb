SUMMARY = "Audio player with remote control"
DESCRIPTION = "MuseIC is a fast and simple music player with remote control from any \
device through internet browser."
LICENSE = "GPL-3.0-only"

PV = "2.1.3"

RPM_NAME = "museic-2.1.3-1.26.aarch64.rpm"
RPM_HASH = "a681e6155b0ef1030133c8c99ce2989a9d17dea0fc2b61c643e6985844b7fc8db648a0e26feadebdf2ed9fc81c03ea9bc54c997a9681b3baff9f54461461e2d4"

RPROVIDES:${PN} += "museic"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0"

inherit rpm
