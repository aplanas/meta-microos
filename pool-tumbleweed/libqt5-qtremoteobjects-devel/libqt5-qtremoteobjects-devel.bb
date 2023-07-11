SUMMARY = "Development files for the Qt5 RemoteObjects library"
DESCRIPTION = "Qt Remote Objects (QtRO) is an inter-process communication (IPC) \
processes or computers. \
 \
You need this package if you want to compile programs with QtRemoteObjects."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde0"

RPM_NAME = "libqt5-qtremoteobjects-devel-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "f6d2b3e5fc2df40e8528327921dc2bc21908ff4228bb39cfcd567dd0f0aec0dd19a49a1b8b4ec17b4653f2fc13503bc6bad0c79b4b4e42e45b8588e350da6920"

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
