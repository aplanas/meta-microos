SUMMARY = "Screenshot software"
DESCRIPTION = "A program to capture screenshots. \
 \
Features: \
 \
 * Customizable appearance \
 * Annotation and drawing tools \
 * DBus interface \
 * Export to file, web"
LICENSE = "GPL-3.0-only"

PV = "12.1.0"

RPM_NAME = "flameshot-12.1.0-2.2.aarch64.rpm"
RPM_HASH = "224f39a91ce0a81f14fa34e89ce0bcb509b4b0d262531f67789b754eec45c186de192171883bc2b20d9eb896151e715efa2b46ccd2482409f9fa3c94d6da78e1"

RPROVIDES:${PN} += "flameshot"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5GuiAddons.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
