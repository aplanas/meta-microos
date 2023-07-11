SUMMARY = "Non-ABI stable API for the Qt 6 LabsSettings library"
DESCRIPTION = "This package provides private headers of libQt6LabsSettings that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-labssettings-private-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "e5791a2790139d3805ab202d673bf1c4373a203fcd250616503e08c30b46f01a23f9735b042ca5d06bc9bf8a0eab233059d1b1760df9790446ea8097dcfc537f"

RPROVIDES:${PN} += "qt6-labssettings-private-devel"

RDEPENDS:${PN} += "cmake-Qt6LabsSettings"

inherit rpm
