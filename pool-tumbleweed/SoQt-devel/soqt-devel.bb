SUMMARY = "Development files for SoQt"
DESCRIPTION = "By using the combination of Coin, Qt and SoQt for your 3D applications, you \
have a framework for writing completely portable software across the whole range \
of UNIX, Linux, Microsoft Windows and Mac OS X operating systems. Coin, Qt and \
SoQt makes this possible from a 100% common codebase, which means there is a \
minimum of hassle for developers when working on multiplatform software, with \
the resulting large gains in productivity."
LICENSE = "BSD-3-Clause"

PV = "1.6.0"

RPM_NAME = "SoQt-devel-1.6.0-2.9.aarch64.rpm"
RPM_HASH = "76c61991ad4620934efae9e5c238bd82c8a961f5557de0b6db14b73766f64e0b87d126eb64e28cd6550fdbcb5cc9f878ee4a777ff9d84e959a1fd30e7f3165f1"

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
