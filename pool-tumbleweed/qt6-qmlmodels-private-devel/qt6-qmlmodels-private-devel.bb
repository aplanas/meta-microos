SUMMARY = "Non-ABI stable API for the Qt 6 QmlModels library"
DESCRIPTION = "This package provides private headers of libQt6QmlModels that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qmlmodels-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "4071d8b702ffa9b5bf455b20e778d799226ac26f870cb75c4ebaba5a6afe54a83c1dd5ab568ba995e28439b0b30944972b063b2881ebe510207ecb0ac3937be3"

RPROVIDES:${PN} += "qt6-qmlmodels-private-devel \
qt6-qmlmodels-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6QmlModels) \
qt6-core-private-devel \
qt6-qml-private-devel"

inherit rpm
