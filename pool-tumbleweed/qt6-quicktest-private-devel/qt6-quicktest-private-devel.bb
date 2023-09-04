SUMMARY = "Non-ABI stable API for the Qt 6 QuickTest library"
DESCRIPTION = "This package provides private headers of libQt6QuickTest that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-quicktest-private-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "34484ed3177f73323bd3cc62f36b7691b69777d6136e6cab213f0f53da612448e4257bd301e30590afd98c3aee4a0662782e5a7951c1ab5d1ea06995f8006e4c"

RPROVIDES:${PN} += "qt6-quicktest-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QuickTest \
qt6-test-private-devel"

inherit rpm
