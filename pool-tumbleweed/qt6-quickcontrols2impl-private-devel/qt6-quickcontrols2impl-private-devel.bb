SUMMARY = "Non-ABI stable API for the Qt 6 QuickControls2Impl library"
DESCRIPTION = "This package provides private headers of libQt6QuickControls2Impl that do not \
have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quickcontrols2impl-private-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "7c6250d849947a793b11081e7080713aebe10cf76cfc35c0b4740b1fde8fc1cad7baa401637c1947a44452c643d0fddf811bf75654422bbee248acdfcc28a9a8"

RPROVIDES:${PN} += "qt6-quickcontrols2impl-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QuickControls2Impl"

inherit rpm
