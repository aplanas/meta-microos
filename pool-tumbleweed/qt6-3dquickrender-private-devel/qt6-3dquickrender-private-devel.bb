SUMMARY = "Non-ABI stable API for the Qt 6 3DQuickRender library"
DESCRIPTION = "This package provides private headers of libQt63DQuickRender that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-3dquickrender-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "7d29073bf17d03e0d32d0c9f47263aed6063d254ad5edddbc0041e7176a15a32229e50b57a32da671f4e7c077abf5b4485ac85e093d369a1f8a0b6e9365ea5b8"

RPROVIDES:${PN} += "qt6-3dquickrender-private-devel"

RDEPENDS:${PN} += "cmake-Qt63DQuickRender \
qt6-3dcore-private-devel \
qt6-3dquick-private-devel \
qt6-3drender-private-devel \
qt6-core-private-devel \
qt6-qml-private-devel"

inherit rpm
