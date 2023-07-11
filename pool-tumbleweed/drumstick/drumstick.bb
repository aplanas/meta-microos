SUMMARY = "MIDI Sequencer C++ Library Bindings"
DESCRIPTION = "This package includes test and example programs for drumstick libraries."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.7.2"

RPM_NAME = "drumstick-2.7.2-1.4.aarch64.rpm"
RPM_HASH = "928c38545ba265b0bdcebfb8f4b5075f6dbd847342d95f87d7dce5f0516eb650383793fbdd919b8ee383e1c11dacf0436dfa2aa48c02778bb0656f78abf9e0bf"

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
