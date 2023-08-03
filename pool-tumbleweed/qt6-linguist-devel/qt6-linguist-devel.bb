SUMMARY = "Qt 6 linguist tools - Development files"
DESCRIPTION = "Development files for the Qt 6 linguist tools."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.2"

RPM_NAME = "qt6-linguist-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "2e7263d9d829919a9d5f074ebe943e184a1c8ef2d4467ef4867f60fbebc357d07d28c3539ead93865957803f77c427fd493c8fefb03a10ea59c644c922dc4796"

RPROVIDES:${PN} += "cmake-Qt6Linguist \
cmake-Qt6LinguistTools \
pkgconfig-Qt6Linguist \
qt6-linguist-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
qt6-tools-linguist"

inherit rpm
