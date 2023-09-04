SUMMARY = "Non-ABI stable API for the Qt 6 WebEngineWidgets library"
DESCRIPTION = "This package provides private headers of libQt6WebEngineWidgets that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-webenginewidgets-private-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "490d43c1e3d5c0b2dfb3b8423dd9d2d84d81398cfd77de6a3bcf496a22fefabea0d0209996ae0944ee7ff7c25f0d846c724d5a479cffe8112a4714ef4f1795d1"

RPROVIDES:${PN} += "qt6-webenginewidgets-private-devel"

RDEPENDS:${PN} += "cmake-Qt6WebEngineWidgets"

inherit rpm
