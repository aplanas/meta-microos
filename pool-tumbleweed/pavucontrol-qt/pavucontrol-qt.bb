SUMMARY = "Qt port of pavucontrol"
DESCRIPTION = "PulseAudio Volume Control (pavucontrol) is a simple volume control tool \
('mixer') for the PulseAudio sound server. In contrast to classic mixer \
tools this one allows you to control both the volume of hardware devices \
and of each playback stream separately."
LICENSE = "GPL-2.0-only"

PV = "1.3.0"

RPM_NAME = "pavucontrol-qt-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "efce14f3d9c288a6d1f5dcd0afb4a6cacd090a93ff384f01c30abe2ce75464a3bf797a46f288d4fe365a32519ab27af6bb0317096eb54887f53bfee304a55c9c"

RPROVIDES:${PN} += "application() \
application(pavucontrol-qt.desktop) \
pavucontrol-qt \
pavucontrol-qt(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libglib-2.0.so.0()(64bit) \
libpulse-mainloop-glib.so.0()(64bit) \
libpulse-mainloop-glib.so.0(PULSE_0)(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
