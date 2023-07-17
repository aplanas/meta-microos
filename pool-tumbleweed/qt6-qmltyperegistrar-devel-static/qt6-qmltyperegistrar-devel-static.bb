SUMMARY = "Qt6 QmlTypeRegistrar static library"
DESCRIPTION = "The Qt6 QmlTypeRegistrar static library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qmltyperegistrar-devel-static-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "8109b9a84a1a3b72d67911519294682577b503cd57479609498b4926af58ba8cd893a49a46ef8826e7312254c1a716a69b4db583eeae57a948c749b76baa11d7"

RPROVIDES:${PN} += "cmake-Qt6QmlTypeRegistrarPrivate \
qt6-qmltyperegistrar-devel-static"

RDEPENDS:${PN} += ""

inherit rpm
