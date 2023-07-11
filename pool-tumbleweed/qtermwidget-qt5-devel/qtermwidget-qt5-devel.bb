SUMMARY = "QTermWidget devel package"
DESCRIPTION = "Development environment for qtermwidget library."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.0"

RPM_NAME = "qtermwidget-qt5-devel-1.3.0-1.2.aarch64.rpm"
RPM_HASH = "3c29bf0b3fc2ceda560b5c1d5654f39d464ead7105138da5dd2040ded75975e304013c8b7e5e6bc79e9aee94e4d8985c6f96439916d6d16e1e53f64b50b26d41"

RPROVIDES:${PN} += "cmake-qtermwidget5 \
pkgconfig-qtermwidget5 \
qtermwidget-qt5-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libqtermwidget5-1 \
pkgconfig-Qt5Widgets \
pkgconfig-libutf8proc"

inherit rpm
