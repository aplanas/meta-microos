SUMMARY = "MIDI Sequencer C++ Library"
DESCRIPTION = "MIDI Sequencer C++ Library Bindings for Qt5 and ALSA. \
This library includes the ALSA Sequencer library classes, providing MIDI \
recording and playback functionality to C++/Qt5 programs."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.7.2"

RPM_NAME = "libdrumstick-alsa2-2.7.2-1.3.aarch64.rpm"
RPM_HASH = "71178ac48131961d0fe58dee5958afee7e55a818b9ab406a0b19b7564656c3965436346c7001a3ff57796876a94ead86705860139342e1f2c987b9b62050d302"

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
