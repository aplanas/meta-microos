SUMMARY = "Grantlee theme support"
DESCRIPTION = "the grantleetheme library adds Grantlee theme support for PIM applications."
LICENSE = "GPL-2.0-only"

PV = "23.08.0"

RPM_NAME = "grantleetheme-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "00fda29804e61ab00682cf94a2fc1f055cc398eb26ea29a5419af811962111b382fd2975a775324edc5848d84040acfd359316625d63ac9839e633c9a22eed85"

RPROVIDES:${PN} += "grantleetheme"

RDEPENDS:${PN} += "grantlee5 \
ld-linux-aarch64.so.1 \
libGrantlee-Templates.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5GuiAddons.so.5 \
libKF5IconThemes.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
