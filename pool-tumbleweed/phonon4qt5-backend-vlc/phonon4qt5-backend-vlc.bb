SUMMARY = "Phonon VLC Backend"
DESCRIPTION = "Phonon is a cross-platform portable Multimedia Support Abstraction, \
which allows you to play multiple audio or video formats with the same \
quality on all platforms, no matter which underlying architecture is \
used. \
 \
This is the VLC backend for Phonon"
LICENSE = "LGPL-2.1-or-later"

PV = "0.11.3"

RPM_NAME = "phonon4qt5-backend-vlc-0.11.3-1.14.aarch64.rpm"
RPM_HASH = "d3fca7941b0851307f77ba4f3820d9df9d99bcaf1d96e8bc02b7a5f0bd2e758778a97a68ddc3b9d61abc5e9e81ddaa60bae61b66e119e84ca85af8d1676dc256"

RPROVIDES:${PN} += "phonon4qt5-backend \
phonon4qt5-backend-vlc"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libphonon4qt5 \
libphonon4qt5.so.4 \
libstdc++.so.6 \
libvlc.so.5 \
libvlccore.so.9 \
vlc-noX"

inherit rpm
