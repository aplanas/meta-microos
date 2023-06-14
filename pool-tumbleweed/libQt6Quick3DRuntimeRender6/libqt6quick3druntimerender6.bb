SUMMARY = "Qt 6 Quick3DRuntimeRender library"
DESCRIPTION = "The Qt 6 Quick3DRuntimeRender library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Quick3DRuntimeRender6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "7002c49587895b1ed8a7119f93f04c9b1d4e354f0a4b015af2c91dec3f4af3fd705dd4e5cd8728deff3e7061ab2db73512ba6d2cd3983f33ab790a10f07f17c8"

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
