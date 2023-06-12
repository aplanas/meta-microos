SUMMARY = "A Music Visualizer"
DESCRIPTION = "projectM is a music visualizer."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.12"

RPM_NAME = "projectM-3.1.12-1.12.aarch64.rpm"
RPM_HASH = "8f4ca09d9feadb14ffb0bfb722892b604c8e7e2eeb6758caff22bb8470ae9924ce7562894d8ffa9c3cc49c5a4cacbf62d3481ffc2bd5999225d8b4cdabb8eb45"

RPROVIDES:${PN} += "application() \
application(projectM-pulseaudio.desktop) \
projectM \
projectM(aarch-64) \
projectM-qt5"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGL.so.1()(64bit) \
libGLESv2.so.2()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5OpenGL.so.5()(64bit) \
libQt5OpenGL.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libSDL2-2.0.so.0()(64bit) \
libSDL2-2.0.so.0(SUSE_2.0.5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libprojectM.so.3()(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
