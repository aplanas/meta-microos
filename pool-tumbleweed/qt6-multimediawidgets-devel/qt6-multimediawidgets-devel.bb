SUMMARY = "Qt 6 MultimediaWidgets library - Development files"
DESCRIPTION = "Development files for the Qt 6 MultimediaWidgets library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-multimediawidgets-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "3f02862585bcc347f7f5683cff45cefe7ac7bf1e89ae688fa86357b6c830ae9b4d39b9106f9947823b700ccc65529a3bb0304cdf0200333b8f6d1c2055caa00c"

RPROVIDES:${PN} += "cmake-Qt6MultimediaWidgets \
pkgconfig-Qt6MultimediaWidgets \
qt6-multimediawidgets-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Multimedia \
cmake-Qt6Widgets \
libQt6MultimediaWidgets6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Multimedia \
pkgconfig-Qt6Widgets"

inherit rpm
