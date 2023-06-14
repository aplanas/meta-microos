SUMMARY = "MIDI Sequencer C++ Library"
DESCRIPTION = "MIDI Sequencer C++ Library Bindings for Qt5 and ALSA. \
This package contains input/output plugins for libdrumstick-rt2."
LICENSE = "Apache-2.0 & GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.7.2"

RPM_NAME = "libdrumstick-rt2-plugins-2.7.2-1.3.aarch64.rpm"
RPM_HASH = "4c35d3c0b5103210195566dc13e501889c2d788d6c49ca64c52b3bd03c349f5583d901cdfa5cde4730a30f191b6b38c05b11f3b928959d47a5540e41b9d86854"

RPROVIDES:${PN} += "libdrumstick-rt-alsa-in.so \
libdrumstick-rt-alsa-out.so \
libdrumstick-rt-eassynth.so \
libdrumstick-rt-fluidsynth.so \
libdrumstick-rt-net-in.so \
libdrumstick-rt-net-out.so \
libdrumstick-rt-oss-in.so \
libdrumstick-rt-oss-out.so \
libdrumstick-rt2-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libdrumstick-alsa.so.2 \
libdrumstick-rt.so.2 \
libfluidsynth.so.3 \
libgcc-s.so.1 \
libpulse-simple.so.0 \
libpulse.so.0 \
libsonivox.so.3 \
libstdc++.so.6"

inherit rpm
