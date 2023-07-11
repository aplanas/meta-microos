SUMMARY = "Non-ABI stable API for the Qt 6 Quick3DRuntimeRender library"
DESCRIPTION = "This package provides private headers of libQt6Quick3DRuntimeRender that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3druntimerender-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "15a44951bc6fbec3b2f4c3c378c29d0cedec14b1afa38ac78d019b28f2605f592018531827c0872675225828f0bf382e121b2a28488fccaf7cb057beabfb2d4a"

RPROVIDES:${PN} += "qt6-quick3druntimerender-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Quick3DRuntimeRender \
qt6-quick-private-devel \
qt6-quick3dassetimport-private-devel \
qt6-quick3dutils-private-devel \
qt6-shadertools-private-devel"

inherit rpm
