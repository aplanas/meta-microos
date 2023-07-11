SUMMARY = "A Music Visualizer"
DESCRIPTION = "projectM is a music visualizer."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.12"

RPM_NAME = "projectM-3.1.12-1.13.aarch64.rpm"
RPM_HASH = "6ba69466677aacd91e3579ead86d8dadf4100eeeb8342e11b4902c19f83c1c3e51d04bab86702371ea533224aa086e1402570a777cc16b0cccb56e67b755a909"

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
