SUMMARY = "Qt 6 ShaderTools library"
DESCRIPTION = "The Qt 6 ShaderTools library and tools."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-shadertools-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "06293b83a2ac93ce1c9fbe9cd822bab1358b96f61c4a7003d3872e7038946d14b2665d4eb916b01e3ae2b6a539f92c4fd87d03431db28a5595574fd8cc5be10f"

RPROVIDES:${PN} += "qt6-shadertools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6ShaderTools.so.6 \
libc.so.6 \
libstdc++.so.6 \
spirv-tools"

inherit rpm
