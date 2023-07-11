SUMMARY = "Multi-panel tabbed file and desktop manager"
DESCRIPTION = "SpaceFM is a multi-panel tabbed file and desktop manager for GNU/Linux \
with built-in VFS, udev-based device manager, customisable menu system \
and bash integration. SpaceFM is popular among novice and power users \
alike for its stability, speed, convenience and flexibility."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "1.0.6"

RPM_NAME = "spacefm-1.0.6-3.14.aarch64.rpm"
RPM_HASH = "91527ec5e458ba18ed68a9ec65d956317148370d5925523a16954ab0368536281c954eac08f48ad1b552e10e17cbf590f2891b853c99b4cfd29d6c9d16c39933"

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
