SUMMARY = "Qt 6 linguist tools - Development files"
DESCRIPTION = "Development files for the Qt 6 linguist tools."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-linguist-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "4b19657e637af94eafa99fcf744cd1660f30a7e83ece54eaa974b7f096913233189fe229f00301b38e5dc325e5dffcf44b3e8963641aec6b04d82c19e4979d32"

RPROVIDES:${PN} += "cmake-Qt6Linguist \
cmake-Qt6LinguistTools \
pkgconfig-Qt6Linguist \
qt6-linguist-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
qt6-tools-linguist"

inherit rpm
