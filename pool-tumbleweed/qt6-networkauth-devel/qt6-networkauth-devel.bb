SUMMARY = "Qt 6 NetworkAuth library - Development files"
DESCRIPTION = "Development files for the Qt 6 NetworkAuth library."
LICENSE = "GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-networkauth-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "e07b8e22a6ef483cb800300a5e011eef8f13b8bd598d6d7af124ed717a7084eb8e8304acbdedf53acf1b0a94e9e4bf7b5f6ddbb6c112aa2f158fbd479630b545"

RPROVIDES:${PN} += "cmake-Qt6NetworkAuth \
pkgconfig-Qt6NetworkAuth \
qt6-networkauth-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Network \
libQt6NetworkAuth6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Network"

inherit rpm
