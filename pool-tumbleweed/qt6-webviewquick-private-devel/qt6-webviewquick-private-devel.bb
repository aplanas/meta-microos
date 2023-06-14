SUMMARY = "Non-ABI stable API for the Qt 6 WebViewQuick library"
DESCRIPTION = "This package provides private headers of libQt6WebViewQuick that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-webviewquick-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "6f1f19d47d8cf93c0ea83006a7e1c4b7dded46301b6593da94c977c2d9fe7b40f54be8d703ca9d7d14a92aa9c7acf9581cc0ff2dc033d16399abbabf535560d0"

RPROVIDES:${PN} += "qt6-webviewquick-private-devel"

RDEPENDS:${PN} += "cmake-Qt6WebViewQuick"

inherit rpm
