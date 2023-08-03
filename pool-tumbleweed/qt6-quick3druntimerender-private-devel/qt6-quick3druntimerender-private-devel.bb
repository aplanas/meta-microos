SUMMARY = "Non-ABI stable API for the Qt 6 Quick3DRuntimeRender library"
DESCRIPTION = "This package provides private headers of libQt6Quick3DRuntimeRender that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-quick3druntimerender-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "dc8cdf88b63200aabfca9c923547a9bf1affb44108b6ecc66aa623ce64635637c10f98ca9f2e772edd67028ec57121b5390d383bcdb7baeab6e75477c3422348"

RPROVIDES:${PN} += "qt6-quick3druntimerender-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Quick3DRuntimeRender \
qt6-quick-private-devel \
qt6-quick3dutils-private-devel \
qt6-shadertools-private-devel"

inherit rpm
