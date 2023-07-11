SUMMARY = "Utilities for graphical user interfaces: Build Environment"
DESCRIPTION = "The KDE GUI addons provide utilities for graphical user interfaces in the areas \
of colors, fonts, text, images, keyboard input. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kguiaddons-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "5492be0da23b27925c41e4aa4bed716a7b5200f8fe6dfcc96c75eccef8cae3eff40bf8c919db2ced4a3ea7f8509adedd3afeec6d0078914cf3b32fc2a8982a4b"

RPROVIDES:${PN} += "cmake-KF5GuiAddons \
kguiaddons-devel"

RDEPENDS:${PN} += "cmake-Qt5Gui \
extra-cmake-modules \
libKF5GuiAddons5"

inherit rpm
