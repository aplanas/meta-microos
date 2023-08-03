SUMMARY = "Non-ABI stable API for the Qt 6 WebViewQuick library"
DESCRIPTION = "This package provides private headers of libQt6WebViewQuick that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-webviewquick-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "162c3258c2454652952d15e2144cb460da921fc27371b3902ecc3bdb3a4b161afc4de59e01b0721fd334693f4a2fef22bc72481bdb69a3a897e0764321d7b7b0"

RPROVIDES:${PN} += "qt6-webviewquick-private-devel"

RDEPENDS:${PN} += "cmake-Qt6WebViewQuick"

inherit rpm
