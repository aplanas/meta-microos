SUMMARY = "Non-ABI stable API for the Qt 6 LabsQmlModels library"
DESCRIPTION = "This package provides private headers of libQt6LabsQmlModels that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-labsqmlmodels-private-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "11b58b79ce19f2bb6186a0213ec591e1259c39ff50e508150b39f898fd895ea82fae629ceec58ac895a651e2504c1ca8c3906235d060c727bce4aea993ab89ad"

RPROVIDES:${PN} += "qt6-labsqmlmodels-private-devel"

RDEPENDS:${PN} += "cmake-Qt6LabsQmlModels"

inherit rpm
