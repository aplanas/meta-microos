SUMMARY = "Development files for the Qt 5 Input 3D library"
DESCRIPTION = "Development files for the Qt 5 Input 3D library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde0"

RPM_NAME = "libQt53DInput-devel-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "1cb06744ba3d92b65099310ded9bcc596877c138645e09ded374f62e1e15ce11244908b481e0b051d53b07b92f53da479344a5294b00400a53bc82799adfc4e7"

RPROVIDES:${PN} += "cmake-Qt53DInput \
libQt53DInput-devel \
pkgconfig-Qt53DInput"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt53DInput5 \
pkgconfig-Qt53DCore \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui"

inherit rpm
