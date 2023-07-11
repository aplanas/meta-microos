SUMMARY = "Development files for the Qt5 Location Library"
DESCRIPTION = "The Qt Location API facilitates creating mapping solutions using \
the data available from some contemporary location services. \
 \
This subpackage contains the header files for developing \
applications that want to make use of the Qt Location libraries."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde4"

RPM_NAME = "libqt5-qtlocation-devel-5.15.10+kde4-1.1.aarch64.rpm"
RPM_HASH = "d00e3a38a6d190547e720f14cec3b24b6e82bcc36d1769a2afd2134b03c7630a5f193d52b77dd7b4f789bf8c40a76f4c1ab31e1434ce7e01a80b326c2c9909f3"

RPROVIDES:${PN} += "cmake-Qt5Location \
cmake-Qt5Positioning \
cmake-Qt5PositioningQuick \
libqt5-qtlocation-devel \
pkgconfig-Qt5Location \
pkgconfig-Qt5Positioning \
pkgconfig-Qt5PositioningQuick"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Location5 \
libQt5Positioning5 \
libQt5PositioningQuick5 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-Qt5Network \
pkgconfig-Qt5Positioning \
pkgconfig-Qt5PositioningQuick \
pkgconfig-Qt5Qml \
pkgconfig-Qt5Quick"

inherit rpm
