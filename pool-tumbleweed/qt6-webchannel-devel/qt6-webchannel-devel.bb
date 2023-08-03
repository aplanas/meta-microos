SUMMARY = "Qt 6 WebChannel library - Development files"
DESCRIPTION = "Development files for the Qt 6 WebChannel library"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-webchannel-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "8d33d14795faca9dc0c2e2a936eefe02b37bbcdda16245842c037768fff32f026c7e57949002fba23b6863102ea9268248e1892ed6804cf603b19c969c195b63"

RPROVIDES:${PN} += "cmake-Qt6WebChannel \
pkgconfig-Qt6WebChannel \
qt6-webchannel-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Qml \
libQt6WebChannel6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Qml"

inherit rpm
