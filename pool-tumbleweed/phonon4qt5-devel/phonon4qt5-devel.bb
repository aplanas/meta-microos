SUMMARY = "Phonon Multimedia Platform Abstraction"
DESCRIPTION = "Phonon is a cross-platform portable Multimedia Support Abstraction, \
which allows you to play multiple audio or video formats with the same \
quality on all platforms, no matter which underlying architecture is \
used."
LICENSE = "LGPL-2.0-or-later"

PV = "4.11.1"

RPM_NAME = "phonon4qt5-devel-4.11.1-3.10.aarch64.rpm"
RPM_HASH = "b28977d6a76d7cd4604b4a43084ddf257d742d48f60381cd59c71bf396b124a23c1588350dabf918e8d2cdc16773e27d460e4eb0d8637097c0b8455a2451e778"

RPROVIDES:${PN} += "cmake-Phonon4Qt5 \
cmake-Phonon4Qt5Experimental \
phonon4qt5-devel \
pkgconfig-phonon4qt5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
extra-cmake-modules \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Designer.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libphonon4qt5 \
libphonon4qt5.so.4 \
libstdc++.so.6"

inherit rpm
