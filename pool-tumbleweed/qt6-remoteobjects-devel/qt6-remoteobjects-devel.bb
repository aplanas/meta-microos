SUMMARY = "Qt 6 RemoteObjects library - Development files"
DESCRIPTION = "Development files for the Qt 6 RemoteObjects library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-remoteobjects-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "91270e8c883746bc75b544f8e8478ce0f1983b2c890c8a7901da0f0bd06d4c7ceac46e82400e85c9c174fca8e5887fbbe46e8a4436db3146486678ad7a077b2e"

RPROVIDES:${PN} += "cmake(Qt6RemoteObjects) \
cmake(Qt6RemoteObjectsTools) \
pkgconfig(Qt6RemoteObjects) \
qt6-remoteobjects-devel \
qt6-remoteobjects-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt6Network) \
libQt6RemoteObjects6 \
pkgconfig(Qt6Core) \
pkgconfig(Qt6Network) \
qt6-remoteobjects-tools"

inherit rpm
