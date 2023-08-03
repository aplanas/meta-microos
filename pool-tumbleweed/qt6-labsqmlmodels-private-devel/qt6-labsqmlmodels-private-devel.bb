SUMMARY = "Non-ABI stable API for the Qt 6 LabsQmlModels library"
DESCRIPTION = "This package provides private headers of libQt6LabsQmlModels that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-labsqmlmodels-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "72c9be4587a22a738e31c4b8034e565155c4eb2c6aa344ea6e2cebff427737721c933de31e29c2fe8119566567e8bb41e5c5379b3911b6531bdd6cfdf082e92f"

RPROVIDES:${PN} += "qt6-labsqmlmodels-private-devel"

RDEPENDS:${PN} += "cmake-Qt6LabsQmlModels"

inherit rpm
