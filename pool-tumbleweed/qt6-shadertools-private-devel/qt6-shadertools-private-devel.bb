SUMMARY = "Non-ABI stable API for the Qt 6 ShaderTools library"
DESCRIPTION = "This package provides private headers of libQt6ShaderTools that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-shadertools-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "f19a62b89cc80627c2c8be8ffedd5ceb594b2c37fe4af57f6f593db59aa200d177d96db48168cef9a7c50b56c5f695d7831c82be66bfed228364e2fbbf3e391c"

RPROVIDES:${PN} += "qt6-shadertools-private-devel"

RDEPENDS:${PN} += "cmake-Qt6ShaderTools \
qt6-gui-private-devel"

inherit rpm
