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
phonon4qt5-backend-vlc \
phonon4qt5-backend-vlc(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libphonon4qt5 \
libphonon4qt5.so.4()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libvlc.so.5()(64bit) \
libvlccore.so.9()(64bit) \
vlc-noX"

inherit rpm
