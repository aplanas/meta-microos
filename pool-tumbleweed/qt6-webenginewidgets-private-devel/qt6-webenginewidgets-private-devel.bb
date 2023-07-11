SUMMARY = "Non-ABI stable API for the Qt 6 WebEngineWidgets library"
DESCRIPTION = "This package provides private headers of libQt6WebEngineWidgets that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-webenginewidgets-private-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "6edaaf61ff6258e5358dc2e82eca3b56dd8fec2d59a39dabd53c960c63a7e0a4696d91bf1b032db78e921a1d930485babdb121eaf1a3dc2e1f049bfe278623aa"

RPROVIDES:${PN} += "qt6-webenginewidgets-private-devel"

RDEPENDS:${PN} += "cmake-Qt6WebEngineWidgets"

inherit rpm
