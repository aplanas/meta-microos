SUMMARY = "Gtksink plugin for gstreamer-plugins-good"
DESCRIPTION = "This package provides the gtksink output plugin for gstreamer-plugins-good."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "gstreamer-plugins-good-gtk-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "62600526547146342ede727d96b9d9b11cce84299925fd5699743800957205623f9b207816231abf58d1d990fe15f43263a751a9b9d992ebfe12d88bdc928905"

RPROVIDES:${PN} += "gstreamer-plugins-good-gtk \
gstreamer-plugins-good-gtk(aarch-64) \
gstreamer1(element-gtkglsink)()(64bit) \
gstreamer1(element-gtksink)()(64bit) \
libgstgtk.so()(64bit)"

RDEPENDS:${PN} += "gstreamer-plugins-good \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstgl-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgstvideo-1.0.so.0()(64bit) \
libgtk-3.so.0()(64bit)"

inherit rpm
