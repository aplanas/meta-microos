SUMMARY = "Utilities for graphical user interfaces"
DESCRIPTION = "The KDE GUI addons provide utilities for graphical user interfaces in the areas \
of colors, fonts, text, images, keyboard input."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kguiaddons-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "2b11b75f2d07fea91d98ae65488779254cd7cc62831242293f549c19bdf138322f2342da333a1f7e24e9a06533f01b5f5b005d6dc5f8aaf2f3e49edcb0542b9c"

RPROVIDES:${PN} += "kguiaddons"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5GuiAddons5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6"

inherit rpm
