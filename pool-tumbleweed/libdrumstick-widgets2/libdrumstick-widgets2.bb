SUMMARY = "MIDI Sequencer C++ Library"
DESCRIPTION = "MIDI Sequencer C++ Library Bindings for Qt5 and ALSA. \
This library includes the Widgets library, providing \
GUI, MIDI related, components for C++/Qt5 programs."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.7.2"

RPM_NAME = "libdrumstick-widgets2-2.7.2-1.3.aarch64.rpm"
RPM_HASH = "18bef1c05dda427fbbd2a937556978812c10515044fa2080863da18f89e92b77deda091af91b385c8a80f2246e9f4176b95d7d865086b31d0f4883f0cb119a03"

RPROVIDES:${PN} += "libdrumstick-widgets \
libdrumstick-widgets.so.2()(64bit) \
libdrumstick-widgets2 \
libdrumstick-widgets2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libdrumstick-rt.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
