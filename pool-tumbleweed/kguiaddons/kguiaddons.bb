SUMMARY = "Utilities for graphical user interfaces"
DESCRIPTION = "The KDE GUI addons provide utilities for graphical user interfaces in the areas \
of colors, fonts, text, images, keyboard input."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kguiaddons-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "c948c3d87b9338b4a4e5a5204d51d96011ae115971eb23b276b573fea5c4bf5eb1f48887b3f37398f0844845320be9d6792b2561aebc5a50896ae06c20c954cf"

RPROVIDES:${PN} += "kguiaddons"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5GuiAddons5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6"

inherit rpm
