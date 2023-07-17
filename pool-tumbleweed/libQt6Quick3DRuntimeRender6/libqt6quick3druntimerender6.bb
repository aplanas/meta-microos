SUMMARY = "Qt 6 Quick3DRuntimeRender library"
DESCRIPTION = "The Qt 6 Quick3DRuntimeRender library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Quick3DRuntimeRender6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "b8413c3223ac4a170b73dd3de56b365be98f907159d23c295d67ebee8342ff89d25c78756447926afd12c8a2e325f48d4df6d4bbe48456c06cf78e234b12b805"

RPROVIDES:${PN} += "libQt6Quick3DRuntimeRender.so.6 \
libQt6Quick3DRuntimeRender6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Quick.so.6 \
libQt6Quick3DUtils.so.6 \
libQt6ShaderTools.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
