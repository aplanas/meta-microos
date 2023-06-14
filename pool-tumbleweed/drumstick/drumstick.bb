SUMMARY = "MIDI Sequencer C++ Library Bindings"
DESCRIPTION = "This package includes test and example programs for drumstick libraries."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.7.2"

RPM_NAME = "drumstick-2.7.2-1.3.aarch64.rpm"
RPM_HASH = "91c60760294f020b13084a956f657d01802b85c72b845bc6c31c1f98cecf8f96c70dbb70bdf4b38ff72d7a5acd94728fbe096814395dcf3ce2bc47721f20ae39"

RPROVIDES:${PN} += "drumstick"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libdrumstick-alsa.so.2 \
libdrumstick-file.so.2 \
libdrumstick-rt.so.2 \
libdrumstick-widgets.so.2 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
