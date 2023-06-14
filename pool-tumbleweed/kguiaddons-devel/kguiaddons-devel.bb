SUMMARY = "Utilities for graphical user interfaces: Build Environment"
DESCRIPTION = "The KDE GUI addons provide utilities for graphical user interfaces in the areas \
of colors, fonts, text, images, keyboard input. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kguiaddons-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "79a7157cbc9c4aa7fa0f8e7a47ab36e0b9285b36b2fbc0eb7a1bbd1e8a4f80782c996c4301033b30e59afb34dc19c51e4f4454709f712f05e8c13e3d6daba124"

RPROVIDES:${PN} += "cmake-KF5GuiAddons \
kguiaddons-devel"

RDEPENDS:${PN} += "cmake-Qt5Gui \
extra-cmake-modules \
libKF5GuiAddons5"

inherit rpm
