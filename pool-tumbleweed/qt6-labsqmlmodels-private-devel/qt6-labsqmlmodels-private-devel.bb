SUMMARY = "Non-ABI stable API for the Qt 6 LabsQmlModels library"
DESCRIPTION = "This package provides private headers of libQt6LabsQmlModels that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-labsqmlmodels-private-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "15e4e285b4d8b319a1f7a887c7e8a67f43ae18223c050b625dc3aac6bc3a95f615776c188c500e0503bb98bcf404e2e70cc923737af73297343d85be375669d0"

RPROVIDES:${PN} += "qt6-labsqmlmodels-private-devel"

RDEPENDS:${PN} += "cmake-Qt6LabsQmlModels"

inherit rpm
