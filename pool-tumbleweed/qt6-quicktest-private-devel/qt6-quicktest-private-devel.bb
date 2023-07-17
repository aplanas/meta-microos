SUMMARY = "Non-ABI stable API for the Qt 6 QuickTest library"
DESCRIPTION = "This package provides private headers of libQt6QuickTest that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quicktest-private-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "036dba8a329c08eb107be16af9ed844ffa8c8486e735c4372a49dd4ebdb55ebe2a07752f9a176de765afac1d429a49971a3eeb8a188890da9d480becdbc66029"

RPROVIDES:${PN} += "qt6-quicktest-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QuickTest \
qt6-test-private-devel"

inherit rpm
