SUMMARY = "Dtkwm libraries"
DESCRIPTION = "DtkWm is used to handle double screen for deepin desktop development. \
This package contains the shared libraries."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.12"

RPM_NAME = "libdtkwm5-2.0.12-2.11.aarch64.rpm"
RPM_HASH = "dac079df9b21075f81324c063e236fbf22a980440f32621223e0f4bbda6854c7ff0ee1d2df77918a84e4a20f30b7cfc4283eb8934d7abe550f2a6705aabe0316"

RPROVIDES:${PN} += "libdtkwm.so.5 \
libdtkwm5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libc.so.6 \
libdtkcore.so.5 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxcb.so.1"

inherit rpm
