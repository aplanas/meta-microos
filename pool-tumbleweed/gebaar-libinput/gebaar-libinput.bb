SUMMARY = "WM Independent Touchpad Gesture Daemon for libinput"
DESCRIPTION = "gebaar-libinput is a window manager independent touchpad gesture \
daemon for libinput. Unlike other gesture daemons, such as \
libinput-gestures and fusuma, which parse the output of libinput \
debug-events, gebaar-libinput interfaces with libinput directly."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.5"

RPM_NAME = "gebaar-libinput-0.0.5-2.11.aarch64.rpm"
RPM_HASH = "8b1cb0187b244ca41955023db69981c20d0114393ab98ebabb2511605c618ab18b5cfee82b382198174cbfc445d8ea9c527692916914f9e86963418f3552320d"

RPROVIDES:${PN} += "gebaar-libinput"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libinput.so.10 \
libstdc++.so.6 \
libudev.so.1"

inherit rpm
