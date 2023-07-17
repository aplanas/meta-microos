SUMMARY = "Non-ABI stable API for the Qt 6 StateMachineQml library"
DESCRIPTION = "This package provides private headers of libQt6StateMachineQml that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-statemachineqml-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "4f74a113bb8a9bd4e2d56f60896e6ccaa5722f1626df1f6abcde3a81389fa7dbf867fd8acccc2b8ed1366f20e364e83aa3dda68d7ef3a1bce429a8a1001f60ff"

RPROVIDES:${PN} += "qt6-statemachineqml-private-devel"

RDEPENDS:${PN} += "cmake-Qt6StateMachineQml"

inherit rpm
