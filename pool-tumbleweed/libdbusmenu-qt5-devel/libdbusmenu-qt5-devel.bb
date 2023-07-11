SUMMARY = "Development package for libdbusmenu-qt5"
DESCRIPTION = "This package contains development files for libdbusmenu-qt5."
LICENSE = "LGPL-2.0-or-later"

PV = "0.9.3+16.04.20160218"

RPM_NAME = "libdbusmenu-qt5-devel-0.9.3+16.04.20160218-1.14.aarch64.rpm"
RPM_HASH = "80493ff43d1e321acfd126950e1a5bfa853a5643b07a6290e712890fd707ff0de782f5bb7136d70d6b9d2b045e270f64253f7b69225ec0aa0b1de85a71db1bed"

RPROVIDES:${PN} += "cmake-dbusmenu-qt5 \
libdbusmenu-qt5-devel \
pkgconfig-dbusmenu-qt5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdbusmenu-qt5-2 \
pkgconfig-Qt5Core"

inherit rpm
