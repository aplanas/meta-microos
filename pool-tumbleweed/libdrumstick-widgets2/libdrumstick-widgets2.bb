SUMMARY = "MIDI Sequencer C++ Library"
DESCRIPTION = "MIDI Sequencer C++ Library Bindings for Qt5 and ALSA. \
This library includes the Widgets library, providing \
GUI, MIDI related, components for C++/Qt5 programs."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.7.2"

RPM_NAME = "libdrumstick-widgets2-2.7.2-1.4.aarch64.rpm"
RPM_HASH = "bb83d7b4b1bfea7aa7af5e56cd475c7f852de2f6544bbde4605b3cb423a72e5cf835e9f10b0b7e79bda2fb435b355f5c9e014cddc379bc38d14bbae08cb58e3c"

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
