SUMMARY = "Phonon Multimedia Platform Abstraction"
DESCRIPTION = "Phonon is a cross-platform portable Multimedia Support Abstraction, \
which allows you to play multiple audio or video formats with the same \
quality on all platforms, no matter which underlying architecture is \
used."
LICENSE = "LGPL-2.0-or-later"

PV = "4.11.1"

RPM_NAME = "phonon4qt5-devel-4.11.1-3.9.aarch64.rpm"
RPM_HASH = "bc58018badd8ef264f297baab263fea9bc88033e43da459d672474bd84c7b5968139c87d9e524d3706f1c6092e1b1e48d497ef347785bee611cab255afef5032"

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
