SUMMARY = "Gtksink plugin for gstreamer-plugins-good"
DESCRIPTION = "This package provides the gtksink output plugin for gstreamer-plugins-good."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "gstreamer-plugins-good-gtk-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "62600526547146342ede727d96b9d9b11cce84299925fd5699743800957205623f9b207816231abf58d1d990fe15f43263a751a9b9d992ebfe12d88bdc928905"

RPROVIDES:${PN} += "gstreamer-plugins-good-gtk \
gstreamer1 \
libgstgtk.so"

RDEPENDS:${PN} += "gstreamer-plugins-good \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstgl-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgtk-3.so.0"

inherit rpm
