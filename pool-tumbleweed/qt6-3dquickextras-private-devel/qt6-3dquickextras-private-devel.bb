SUMMARY = "Non-ABI stable API for the Qt 6 3DQuickExtras library"
DESCRIPTION = "This package provides private headers of libQt63DQuickExtras that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3dquickextras-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "3e8a1d2f0401d676dac969ce31aa26f4513e66c59ac7043a9734b0da6e7373728e9106a638eb8f31a10c5734a83cd392478659b687c6f666c61742c8aad8c644"

RPROVIDES:${PN} += "qt6-3dquickextras-private-devel"

RDEPENDS:${PN} += "cmake-Qt63DQuickExtras \
qt6-3dextras-private-devel \
qt6-3dquick-private-devel \
qt6-3drender-private-devel \
qt6-core-private-devel \
qt6-qml-private-devel"

inherit rpm
