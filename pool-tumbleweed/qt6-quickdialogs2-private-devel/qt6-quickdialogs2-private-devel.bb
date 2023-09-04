SUMMARY = "Non-ABI stable API for the Qt 6 QuickDialogs2 library"
DESCRIPTION = "This package provides private headers of libQt6QuickDialogs2 that do not have \
any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-quickdialogs2-private-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "dfff2c3e67fe3d805621ee07e92bcac04956529ee372fca71d45e44bf7c34bfe3afc8245aa0b6a51e243ff2f6c27a4e0dba1e89686182b173167ab94fd733175"

RPROVIDES:${PN} += "qt6-quickdialogs2-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QuickDialogs2 \
qt6-qmlmodels-private-devel"

inherit rpm
