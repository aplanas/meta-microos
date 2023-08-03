SUMMARY = "Qt 6 Quick3DRuntimeRender library"
DESCRIPTION = "The Qt 6 Quick3DRuntimeRender library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "libQt6Quick3DRuntimeRender6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "207c791efe85d0f17f933d86b2f185c52a521480db2f6d236c22e08ab4131825255076e3cc128f7538bc321557c3d179ba842aadf7a172deb84e4054f2927925"

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
