SUMMARY = "Non-ABI stable API for the Qt 6 WebEngineWidgets library"
DESCRIPTION = "This package provides private headers of libQt6WebEngineWidgets that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-webenginewidgets-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "53f6120ea236306387b0792b0b8c0f60c2ba2016bb705792b56be1cbaa414002d503054da18b52806e2e7f2fa5daba02148ce91d35708702cd11797c449a4949"

RPROVIDES:${PN} += "qt6-webenginewidgets-private-devel"

RDEPENDS:${PN} += "cmake-Qt6WebEngineWidgets"

inherit rpm
