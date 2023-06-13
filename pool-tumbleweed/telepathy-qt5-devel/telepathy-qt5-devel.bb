SUMMARY = "Header files, libraries and development documentation for telepathy-qt5"
DESCRIPTION = "This package contains the header files, static libraries and development documentation for telepathy-qt5. If you like to develop programs using telepathy-qt5, you will need to install telepathy-qt5-devel."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.8"

RPM_NAME = "telepathy-qt5-devel-0.9.8-1.15.aarch64.rpm"
RPM_HASH = "bd434dfe24a7c0d8d90a673994eb1731be59274ee86e3d1c0b77a8b49b79ccaf29833edd81ebd3530d2c24c2d1835b71163d73f4f3998d8f813cbf219cff47ee"

RPROVIDES:${PN} += "cmake(TelepathyQt5) \
cmake(TelepathyQt5Farstream) \
cmake(TelepathyQt5Service) \
pkgconfig(TelepathyQt5) \
pkgconfig(TelepathyQt5Farstream) \
pkgconfig(TelepathyQt5Service) \
telepathy-qt5-devel \
telepathy-qt5-devel(aarch-64) \
telepathy-qt5-service-devel-static"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtelepathy-qt5-0 \
libtelepathy-qt5-farstream0 \
libtelepathy-qt5-service1 \
pkgconfig(Qt5Core) \
pkgconfig(Qt5DBus) \
pkgconfig(Qt5Network) \
pkgconfig(Qt5Xml) \
pkgconfig(gstreamer-1.0) \
pkgconfig(gstreamer-plugins-base-1.0) \
pkgconfig(telepathy-farstream) \
pkgconfig(telepathy-glib)"

inherit rpm
