SUMMARY = "Multi-panel tabbed file and desktop manager"
DESCRIPTION = "SpaceFM is a multi-panel tabbed file and desktop manager for GNU/Linux \
with built-in VFS, udev-based device manager, customisable menu system \
and bash integration. SpaceFM is popular among novice and power users \
alike for its stability, speed, convenience and flexibility."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "1.0.6"

RPM_NAME = "spacefm-1.0.6-3.13.aarch64.rpm"
RPM_HASH = "bb43e8084d4ae9ee60f57eaae1e11a5db2fb27b337026c0c148f7c2b16d00adf70b4ee7ebf1ef55c78b99dc536433e45e28e3edcda5dbfb275ccdb62e7d8ccbf"

RPROVIDES:${PN} += "config-spacefm \
spacefm"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libffmpegthumbnailer.so.4 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgthread-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libudev.so.1"

inherit rpm
