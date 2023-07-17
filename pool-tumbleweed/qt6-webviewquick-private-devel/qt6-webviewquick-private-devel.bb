SUMMARY = "Non-ABI stable API for the Qt 6 WebViewQuick library"
DESCRIPTION = "This package provides private headers of libQt6WebViewQuick that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-webviewquick-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "724faadd7f7c72d4a444f6c26cdcce6d51799d527206424292feaa19669193209e09022552a3d954e66620fa5089325a1612a062ac68b7e89a1610984fa4cf6c"

RPROVIDES:${PN} += "qt6-webviewquick-private-devel"

RDEPENDS:${PN} += "cmake-Qt6WebViewQuick"

inherit rpm
