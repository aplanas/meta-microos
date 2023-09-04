SUMMARY = "Non-ABI stable API for the Qt 6 LabsSettings library"
DESCRIPTION = "This package provides private headers of libQt6LabsSettings that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-labssettings-private-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "1019de5162e24f447e85d65f615ee57522f8c7c00bb8fb7462866aa48f15be8929450b11d0ef4f3b8b9d4365b3395073d95b2b4cb25cfd0bfe965b1a1e808740"

RPROVIDES:${PN} += "qt6-labssettings-private-devel"

RDEPENDS:${PN} += "cmake-Qt6LabsSettings"

inherit rpm
