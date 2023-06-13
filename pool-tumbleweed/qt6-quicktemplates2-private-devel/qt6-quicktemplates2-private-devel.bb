SUMMARY = "Non-ABI stable API for the Qt 6 QuickTemplates2 library"
DESCRIPTION = "This package provides private headers of libQt6QuickTemplates2 that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quicktemplates2-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "e54a685225374f444b81fd5441dac7ece3d7390199a94ca5e42407a780678f19629a0dbb4257f0ba3a94e60a8d2ca6fa18690b28dce4a426ac3fb9c208f30abd"

RPROVIDES:${PN} += "qt6-quicktemplates2-private-devel \
qt6-quicktemplates2-private-devel(aarch-64)"

RDEPENDS:${PN} += "cmake(Qt6QuickTemplates2)"

inherit rpm
