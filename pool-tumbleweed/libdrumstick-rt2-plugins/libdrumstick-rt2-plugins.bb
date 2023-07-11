SUMMARY = "MIDI Sequencer C++ Library"
DESCRIPTION = "MIDI Sequencer C++ Library Bindings for Qt5 and ALSA. \
This package contains input/output plugins for libdrumstick-rt2."
LICENSE = "Apache-2.0 & GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.7.2"

RPM_NAME = "libdrumstick-rt2-plugins-2.7.2-1.4.aarch64.rpm"
RPM_HASH = "10af36d914811c72db99ea0c2840ae70403be84cb6a13b36e4f320c91e27b0d1b92a730818cf38379c0426887664421c16ab93f5486664e0173f8b3f27a7bc06"

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
