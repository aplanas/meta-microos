SUMMARY = "Utilities for graphical user interfaces"
DESCRIPTION = "The KDE GUI addons provide utilities for graphical user interfaces in the areas \
of colors, fonts, text, images, keyboard input."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kguiaddons-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "19c202e11ca11e9563e11d85c69a8f60cb3a94cc5f1fd931a1f5d86f66445adc534ed608fce9d8648ed7d9ea3c16deba5822101fae220f0526d94d013bc1c415"

RPROVIDES:${PN} += "kguiaddons"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5GuiAddons5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6"

inherit rpm
