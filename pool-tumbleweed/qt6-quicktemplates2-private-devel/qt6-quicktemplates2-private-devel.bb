SUMMARY = "Non-ABI stable API for the Qt 6 QuickTemplates2 library"
DESCRIPTION = "This package provides private headers of libQt6QuickTemplates2 that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quicktemplates2-private-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "7e9ab3c4373a20b0553ba9d90a0da360d307b00931c6aab8b11d83d662f5036551f982edc19b5505e2adfaa64bbb5c891f15fefe5538791d3f8931d40a356763"

RPROVIDES:${PN} += "qt6-quicktemplates2-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QuickTemplates2 \
qt6-qmlmodels-private-devel"

inherit rpm
