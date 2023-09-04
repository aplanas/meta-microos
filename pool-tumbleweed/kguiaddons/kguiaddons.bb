SUMMARY = "Utilities for graphical user interfaces"
DESCRIPTION = "The KDE GUI addons provide utilities for graphical user interfaces in the areas \
of colors, fonts, text, images, keyboard input."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kguiaddons-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "919eba13b6258a45908c94718a273755dcd3cdf6b1441f85c82d7f2fa71b4afcaf3b3e9d66ee58980cab9d1c56ffa11ec4cd30556e08b77586db311139b376e3"

RPROVIDES:${PN} += "kguiaddons"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5GuiAddons5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6"

inherit rpm
