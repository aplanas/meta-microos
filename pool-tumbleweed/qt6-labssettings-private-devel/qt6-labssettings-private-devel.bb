SUMMARY = "Non-ABI stable API for the Qt 6 LabsSettings library"
DESCRIPTION = "This package provides private headers of libQt6LabsSettings that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-labssettings-private-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "f731334f3c3a219460dbf1611629d3cd2d90f562252c52bbe29ad8b6f60360c2d44c4f6b3cd2e7db037bdf1c2a5b0d48b5a31b0b89b03cf35f73730d6d9c465a"

RPROVIDES:${PN} += "qt6-labssettings-private-devel"

RDEPENDS:${PN} += "cmake-Qt6LabsSettings"

inherit rpm
