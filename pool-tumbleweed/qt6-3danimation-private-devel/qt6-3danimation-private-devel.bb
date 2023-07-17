SUMMARY = "Non-ABI stable API for the Qt 6 3DAnimation library"
DESCRIPTION = "This package provides private headers of libQt63DAnimation that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3danimation-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "51b4bd707993ba5f1cfd5fa54b456abefcef6a31d5bc292daaaa524c8bcaa3b86d2fe8158c2ec31f24c415872c3fb035647b7b7b31c4f07b3c9ecca0e206f285"

RPROVIDES:${PN} += "qt6-3danimation-private-devel"

RDEPENDS:${PN} += "cmake-Qt63DAnimation \
qt6-3dcore-private-devel \
qt6-3drender-private-devel \
qt6-core-private-devel"

inherit rpm
