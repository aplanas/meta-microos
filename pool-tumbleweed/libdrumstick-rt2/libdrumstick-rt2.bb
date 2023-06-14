SUMMARY = "MIDI Sequencer C++ Library"
DESCRIPTION = "MIDI Sequencer C++ Library Bindings for Qt5 and ALSA. \
This library includes a class for managing realtime MIDI input/output backends."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.7.2"

RPM_NAME = "libdrumstick-rt2-2.7.2-1.3.aarch64.rpm"
RPM_HASH = "367ae149f6c78ac4f9692ba0371c6557938d841f41dbd3e757df82367a8f7e458cad0f01b44c37579370463900b3343dbe7a17f7c84d1fd3f9c8ac1876992647"

RPROVIDES:${PN} += "libdrumstick-rt.so.2 \
libdrumstick-rt2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libdrumstick-rt2-plugins \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
