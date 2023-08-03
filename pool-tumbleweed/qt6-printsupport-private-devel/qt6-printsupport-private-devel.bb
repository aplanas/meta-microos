SUMMARY = "Non-ABI stable API for the Qt 6 PrintSupport library"
DESCRIPTION = "This package provides private headers of libQt6PrintSupport that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-printsupport-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "8cdcaf51ae276dcd1065cd2724a0f1cc511354c0edee1bfb4c225b31119be1e19c2811f3a24c62faa89d1268227868c95db5b718bd6a14980e3438b11f750160"

RPROVIDES:${PN} += "qt6-printsupport-private-devel"

RDEPENDS:${PN} += "cmake-Qt6PrintSupport \
cups-devel \
qt6-core-private-devel \
qt6-gui-private-devel \
qt6-widgets-private-devel"

inherit rpm
