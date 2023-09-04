SUMMARY = "Non-ABI stable API for the Qt 6 QuickControls2 library"
DESCRIPTION = "This package provides private headers of libQt6QuickControls2 that do not have \
any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-quickcontrols2-private-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "2666c3b63f305acb6b1715c7b67fbe945eb39db4c21180d77eaa1dc532c8dd8da1cca9b0cb438ee043eda695d7becd264077732936e659a1e164bb84b8248937"

RPROVIDES:${PN} += "qt6-quickcontrols2-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QuickControls2"

inherit rpm
