SUMMARY = "Qt 6 ShaderTools library"
DESCRIPTION = "The Qt 6 ShaderTools library and tools."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-shadertools-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "4757f47702c86d9a4b5ee133bd101937e3017a8cfaca008167bf4a659b467cbca8c51088d26bad73d710c23bd33c9e3b7c349b0127a3768d848812f82d5e8cad"

RPROVIDES:${PN} += "qt6-shadertools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6ShaderTools.so.6 \
libc.so.6 \
libstdc++.so.6 \
spirv-tools"

inherit rpm
