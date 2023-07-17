SUMMARY = "Qt 6 linguist tools - Development files"
DESCRIPTION = "Development files for the Qt 6 linguist tools."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-linguist-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "51879f456642c14e6c83b44179e78e813b9ef2a19a91a67c6f90d05ddc7a1a3b6bb7450000eccc69792fd0362f04060bc6d94e39d912974b4f2ac2a96fcd0067"

RPROVIDES:${PN} += "cmake-Qt6Linguist \
cmake-Qt6LinguistTools \
pkgconfig-Qt6Linguist \
qt6-linguist-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
qt6-tools-linguist"

inherit rpm
