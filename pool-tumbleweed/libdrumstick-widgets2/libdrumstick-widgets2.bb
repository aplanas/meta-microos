SUMMARY = "MIDI Sequencer C++ Library"
DESCRIPTION = "MIDI Sequencer C++ Library Bindings for Qt5 and ALSA. \
This library includes the Widgets library, providing \
GUI, MIDI related, components for C++/Qt5 programs."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.7.2"

RPM_NAME = "libdrumstick-widgets2-2.7.2-1.3.aarch64.rpm"
RPM_HASH = "18bef1c05dda427fbbd2a937556978812c10515044fa2080863da18f89e92b77deda091af91b385c8a80f2246e9f4176b95d7d865086b31d0f4883f0cb119a03"

RPROVIDES:${PN} += "libdrumstick-widgets \
libdrumstick-widgets.so.2 \
libdrumstick-widgets2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libdrumstick-rt.so.2 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
