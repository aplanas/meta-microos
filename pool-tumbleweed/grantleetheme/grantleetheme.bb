SUMMARY = "Grantlee theme support"
DESCRIPTION = "the grantleetheme library adds Grantlee theme support for PIM applications."
LICENSE = "GPL-2.0-only"

PV = "23.04.1"

RPM_NAME = "grantleetheme-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "0dc9b834abfc2815f89c825a117a210617be33d5cc4cede641e85f40f7c18ca048809fd7fef41953e8f5f071de21d50ca6968784c45f1e8519c01be0c6fff193"

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
