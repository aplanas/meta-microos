SUMMARY = "Development files for the Qt 5 QuickInput 3D library"
DESCRIPTION = "Development files for the Qt 5 Quick Input 3D library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde0"

RPM_NAME = "libQt53DQuickInput-devel-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "7d39f43eeb73b6c39fe71486b2a18d080fb4ab7217dfb0c474501d849ad74716df0b92abad925707dd65fe580635dfe34b48769bc10fc1d957e0e9665278b17c"

RPROVIDES:${PN} += "cmake-Qt53DQuickInput \
libQt53DQuickInput-devel \
pkgconfig-Qt53DQuickInput"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt53DQuickInput5 \
pkgconfig-Qt53DCore \
pkgconfig-Qt53DInput \
pkgconfig-Qt53DQuick \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-Qt5Qml"

inherit rpm
