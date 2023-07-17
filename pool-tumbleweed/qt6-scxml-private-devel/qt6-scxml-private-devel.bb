SUMMARY = "Non-ABI stable API for the Qt 6 Scxml library"
DESCRIPTION = "This package provides private headers of libQt6Scxml that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-scxml-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "b0b1defeb05f243ee5577ffafbe5817cc3b2fe7d64055a0437060469306b722907ea6a6904e0e0af1056752ce2dd59c291acd52121198cc0ee159743683e801a"

RPROVIDES:${PN} += "qt6-scxml-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Scxml \
qt6-core-private-devel"

inherit rpm
