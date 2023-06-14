SUMMARY = "Development files for SoQt"
DESCRIPTION = "By using the combination of Coin, Qt and SoQt for your 3D applications, you \
have a framework for writing completely portable software across the whole range \
of UNIX, Linux, Microsoft Windows and Mac OS X operating systems. Coin, Qt and \
SoQt makes this possible from a 100% common codebase, which means there is a \
minimum of hassle for developers when working on multiplatform software, with \
the resulting large gains in productivity."
LICENSE = "BSD-3-Clause"

PV = "1.6.0"

RPM_NAME = "SoQt-devel-1.6.0-2.8.aarch64.rpm"
RPM_HASH = "28b27987c6f913b6ccd34393d0a372c65a2395adaa95e33ec8b5c538a86668d0cb158290e03b86c01651406a98f04036ccc874e8ec27c1c932314183b839104a"

RPROVIDES:${PN} += "SoQt-devel \
cmake-soqt \
pkgconfig-SoQt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt5Gui \
cmake-Qt5OpenGL \
cmake-Qt5Widgets \
cmake-coin \
libSoQt20 \
libpng-devel \
pkgconfig-Coin \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-Qt5OpenGL \
pkgconfig-Qt5Widgets"

inherit rpm
