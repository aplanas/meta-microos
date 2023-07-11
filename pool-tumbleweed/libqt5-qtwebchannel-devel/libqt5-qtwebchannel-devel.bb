SUMMARY = "Development files for the Qt5 WebChannel library"
DESCRIPTION = "You need this package if you want to compile programs with qtwebchannel."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde3"

RPM_NAME = "libqt5-qtwebchannel-devel-5.15.10+kde3-1.1.aarch64.rpm"
RPM_HASH = "07400eeeb7e11bd9be1ea33d826f60d235a8a2ea9899136ca72e264ee1f1e0147f3b13b448cea6639ae65816640dde1864b6cc38c25303a3e72e4f7d8d4c32df"

RPROVIDES:${PN} += "cmake-Qt5WebChannel \
libqt5-qtwebchannel-devel \
pkgconfig-Qt5WebChannel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5WebChannel5 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Qml"

inherit rpm
