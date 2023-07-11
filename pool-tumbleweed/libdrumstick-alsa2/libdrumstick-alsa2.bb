SUMMARY = "MIDI Sequencer C++ Library"
DESCRIPTION = "MIDI Sequencer C++ Library Bindings for Qt5 and ALSA. \
This library includes the ALSA Sequencer library classes, providing MIDI \
recording and playback functionality to C++/Qt5 programs."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.7.2"

RPM_NAME = "libdrumstick-alsa2-2.7.2-1.4.aarch64.rpm"
RPM_HASH = "f834d114b61783a29313bd17cf135072cf7caf3e4927bc2c653a021b136f0971b59c3ce8270be4b55c4cf0db3551833b876663851b26fa17333648bc37fde298"

RPROVIDES:${PN} += "libdrumstick-alsa.so.2 \
libdrumstick-alsa2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libasound.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
