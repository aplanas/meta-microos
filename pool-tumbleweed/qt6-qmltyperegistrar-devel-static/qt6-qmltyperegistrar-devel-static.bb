SUMMARY = "Qt6 QmlTypeRegistrar static library"
DESCRIPTION = "The Qt6 QmlTypeRegistrar static library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-qmltyperegistrar-devel-static-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "2d1a6e64b2c74ab312a949a7b1a9475d8fd6b15e7cc100491dc9168fd187b9475a4d5f1e778cf8a8c308559c684247f8c0ef816106899bb2d06beb8c4c52c6c3"

RPROVIDES:${PN} += "cmake-Qt6QmlTypeRegistrarPrivate \
qt6-qmltyperegistrar-devel-static"

RDEPENDS:${PN} += ""

inherit rpm
