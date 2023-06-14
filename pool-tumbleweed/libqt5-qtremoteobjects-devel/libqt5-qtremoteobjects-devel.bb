SUMMARY = "Development files for the Qt5 RemoteObjects library"
DESCRIPTION = "Qt Remote Objects (QtRO) is an inter-process communication (IPC) \
processes or computers. \
 \
You need this package if you want to compile programs with QtRemoteObjects."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qtremoteobjects-devel-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "cb0ceea7a2fb108b89bc4d02a02aed3104a2e715cb6f377a8da244f21e437748dce85ffc826b9309198a65ab6071b5e650c672fd96030d9036d0b7b6265b2e3c"

RPROVIDES:${PN} += "cmake-Qt5RemoteObjects \
cmake-Qt5RepParser \
libqt5-qtremoteobjects-devel \
pkgconfig-Qt5RemoteObjects \
pkgconfig-Qt5RepParser"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5RemoteObjects5 \
libqt5-qtremoteobjects-tools \
pkgconfig-Qt5Core \
pkgconfig-Qt5Network"

inherit rpm
