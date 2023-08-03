SUMMARY = "Non-ABI stable API for the Qt 6 Scxml library"
DESCRIPTION = "This package provides private headers of libQt6Scxml that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-scxml-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "97b712e66a48554ea4d39ecd882817e6860c1c2f8024199549c5acd7b7b27ca4f59b6172ceaf368cc2bc8d4672bf1cbe0687b2b161e719b06ab0723f6a43e835"

RPROVIDES:${PN} += "qt6-scxml-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Scxml \
qt6-core-private-devel"

inherit rpm
