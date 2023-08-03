SUMMARY = "Non-ABI stable API for the Qt 6 WebEngineWidgets library"
DESCRIPTION = "This package provides private headers of libQt6WebEngineWidgets that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-webenginewidgets-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "e8c6b4c146984879c08f36f7261297829849de5709d0b84e3469de7efb13136049371da9b4aae41f840f2629ca69f23ecd47191e2bd33d5620c5152e474c8362"

RPROVIDES:${PN} += "qt6-webenginewidgets-private-devel"

RDEPENDS:${PN} += "cmake-Qt6WebEngineWidgets"

inherit rpm
