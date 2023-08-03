SUMMARY = "Non-ABI stable API for the Qt 6 LabsAnimation library"
DESCRIPTION = "This package provides private headers of libQt6LabsAnimation that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-labsanimation-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "fb4241d29491652821171796499bca25b4e852f11dcdaf68edd6d389e16760f710bfed4370e38a792e4d799190318122460dd817aa417a0b49025b63da67faa9"

RPROVIDES:${PN} += "qt6-labsanimation-private-devel"

RDEPENDS:${PN} += "cmake-Qt6LabsAnimation"

inherit rpm
