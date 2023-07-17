SUMMARY = "Qt 6 ShaderTools library"
DESCRIPTION = "The Qt 6 ShaderTools library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6ShaderTools6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "4a21b71be6b8f44ffa76c0a12b95f523a9caa9c3f02ead9c8d90bde33e9d71b3434645073eaf82797f2391bf8aaa897a9ce12edb67f1a40b52062ed55f14ba2e"

RPROVIDES:${PN} += "libQt6ShaderTools.so.6 \
libQt6ShaderTools6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
