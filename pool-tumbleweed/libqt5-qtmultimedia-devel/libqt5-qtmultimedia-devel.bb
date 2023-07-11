SUMMARY = "Development files for the Qt5 Multimedia library"
DESCRIPTION = "You need this package if you want to compile programs with qtmultimedia."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde3"

RPM_NAME = "libqt5-qtmultimedia-devel-5.15.10+kde3-1.1.aarch64.rpm"
RPM_HASH = "13ce8e62c1dd6c952f8345c5c912eb978cfb61128bb91280b2012b0cc92b1d794db562c9a9f46a11c91856e800b7cb910565943281959659b5f3e2b14ea8db8d"

RPROVIDES:${PN} += "cmake-Qt5Multimedia \
cmake-Qt5MultimediaGstTools \
cmake-Qt5MultimediaQuick \
cmake-Qt5MultimediaWidgets \
libQt5Multimedia-devel \
libqt5-qtmultimedia-devel \
pkgconfig-Qt5Multimedia \
pkgconfig-Qt5MultimediaWidgets"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Multimedia5 \
libpulse-devel \
libqt5-qtdeclarative-devel \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-Qt5Multimedia \
pkgconfig-Qt5Network \
pkgconfig-Qt5Widgets"

inherit rpm
