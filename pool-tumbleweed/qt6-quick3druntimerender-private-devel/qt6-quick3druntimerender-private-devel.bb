SUMMARY = "Non-ABI stable API for the Qt 6 Quick3DRuntimeRender library"
DESCRIPTION = "This package provides private headers of libQt6Quick3DRuntimeRender that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3druntimerender-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "bdfb9ba04905a1fe1068beb26c8d7bdb7b092fa4ba0f1ed40470977744b8b5a4d01c37f7efbb4aa2342aa932ab0dc9431bde7f42f28f6ce6fe35989290473775"

RPROVIDES:${PN} += "qt6-quick3druntimerender-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Quick3DRuntimeRender \
qt6-quick-private-devel \
qt6-quick3dutils-private-devel \
qt6-shadertools-private-devel"

inherit rpm
