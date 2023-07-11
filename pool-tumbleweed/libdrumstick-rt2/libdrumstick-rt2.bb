SUMMARY = "MIDI Sequencer C++ Library"
DESCRIPTION = "MIDI Sequencer C++ Library Bindings for Qt5 and ALSA. \
This library includes a class for managing realtime MIDI input/output backends."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.7.2"

RPM_NAME = "libdrumstick-rt2-2.7.2-1.4.aarch64.rpm"
RPM_HASH = "41297fa8df05391e97efa88837d039d89a5475bfeaa079b2982686692f3f84fdb2c67a27b896ca27c0444f3d0a1fc978cab0519e3e2712fed778eef7bf129a4f"

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
