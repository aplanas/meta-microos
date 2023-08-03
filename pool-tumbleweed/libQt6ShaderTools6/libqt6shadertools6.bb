SUMMARY = "Qt 6 ShaderTools library"
DESCRIPTION = "The Qt 6 ShaderTools library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "libQt6ShaderTools6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "e7d4b23ae4188c3801b96e9c676ceebb045e32210977ef459a0d4f937f383e7aa61c83191eb04a9686cac0d60f4b1b34116976a1098008f238054e3c361f1274"

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
