SUMMARY = "Qt 6 Quick3DRuntimeRender library"
DESCRIPTION = "The Qt 6 Quick3DRuntimeRender library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Quick3DRuntimeRender6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "1690ce0a001339587cce7baee4ed3f879d8af7ce8a63380d84372934c928013e99a92bf84a36b7415d5cab73cd2ac5ecdef3f19a6726cea8083255871d2716ea"

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
