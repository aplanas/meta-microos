SUMMARY = "Development files for libfm-qt"
DESCRIPTION = "Libfm-Qt libraries for development"
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "libfm-qt-devel-1.3.0-1.4.aarch64.rpm"
RPM_HASH = "e9dd0dedaa171bd2e37bb0053bb73924d7e9b760b636cd3114c63859745a66b569f7852cfb0b524a9a18b7b41da44fb236cd18168f29f46844efc21fd14fcd5c"

RPROVIDES:${PN} += "cmake-fm-qt \
libfm-qt-devel \
pkgconfig-libfm-qt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfm-qt13 \
pkgconfig \
pkgconfig-Qt5Widgets \
pkgconfig-Qt5X11Extras \
pkgconfig-libmenu-cache"

inherit rpm
