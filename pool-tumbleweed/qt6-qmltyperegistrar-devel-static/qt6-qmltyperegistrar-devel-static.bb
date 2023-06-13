SUMMARY = "Qt6 QmlTypeRegistrar static library"
DESCRIPTION = "The Qt6 QmlTypeRegistrar static library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qmltyperegistrar-devel-static-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "58a46a98bb501a4ae109b26377758cd47abe60e2149f599bcaf2bb74fdeb5135d4070a70fa736e9bd222b78fc82421635c7037dcee0ba4bee3f372801d1cefd8"

RPROVIDES:${PN} += "cmake(Qt6QmlTypeRegistrarPrivate) \
qt6-qmltyperegistrar-devel-static \
qt6-qmltyperegistrar-devel-static(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
