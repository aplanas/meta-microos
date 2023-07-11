SUMMARY = "Non-ABI stable API for the Qt 6 LabsAnimation library"
DESCRIPTION = "This package provides private headers of libQt6LabsAnimation that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-labsanimation-private-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "12d4731a91d01a577d2aa3d2a0f2f232f905f55878015d6df4a965f7603f33fda97d2b568ed84f75904a02dd54ad7cd765eecbc6980d2e4212b640f82c5a6fe9"

RPROVIDES:${PN} += "qt6-labsanimation-private-devel"

RDEPENDS:${PN} += "cmake-Qt6LabsAnimation"

inherit rpm
