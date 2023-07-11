SUMMARY = "Non-ABI stable API for the Qt 6 QuickDialogs2Utils library"
DESCRIPTION = "This package provides private headers of libQt6QuickDialogs2Utils that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quickdialogs2utils-private-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "289bb30321f48248ff6409308727a31384d56f7dbbed55e5475dc5ad60a4835f4c6ead335b29b7e0152cf087ab5fa68ad5add143b36ef1d6f0681ddd390a5046"

RPROVIDES:${PN} += "qt6-quickdialogs2utils-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QuickDialogs2Utils"

inherit rpm
