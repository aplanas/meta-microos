SUMMARY = "Non-ABI stable API for the Qt 6 QuickTest library"
DESCRIPTION = "This package provides private headers of libQt6QuickTest that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quicktest-private-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "6f578dabb0b028dbe2e2113a441a4866268706397d724a7c3f696e678f8a8c7660481cb40dae6fed699289dcb6c4b950185e9ac488ab4c3d36b6a9e0958bafcd"

RPROVIDES:${PN} += "qt6-quicktest-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QuickTest \
qt6-test-private-devel"

inherit rpm
