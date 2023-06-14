SUMMARY = "Non-ABI stable API for the Qt 6 ShaderTools library"
DESCRIPTION = "This package provides private headers of libQt6ShaderTools that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-shadertools-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "e98409f6b1caf8e3fb0390310507c27297f11b277aa6df33f0c1b2955db6d277b69347adc48da512e9a03998fa537366f2ab4b6dc8294e8510c9556018c6fc5a"

RPROVIDES:${PN} += "qt6-shadertools-private-devel"

RDEPENDS:${PN} += "cmake-Qt6ShaderTools \
qt6-core-private-devel"

inherit rpm
