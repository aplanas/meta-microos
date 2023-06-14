SUMMARY = "A Music Visualizer"
DESCRIPTION = "projectM is a music visualizer."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.12"

RPM_NAME = "projectM-3.1.12-1.12.aarch64.rpm"
RPM_HASH = "8f4ca09d9feadb14ffb0bfb722892b604c8e7e2eeb6758caff22bb8470ae9924ce7562894d8ffa9c3cc49c5a4cacbf62d3481ffc2bd5999225d8b4cdabb8eb45"

RPROVIDES:${PN} += "projectM \
projectM-qt5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLESv2.so.2 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5OpenGL.so.5 \
libQt5Widgets.so.5 \
libSDL2-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libprojectM.so.3 \
libpulse.so.0 \
libstdc++.so.6"

inherit rpm
