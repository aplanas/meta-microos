SUMMARY = "Utilities for graphical user interfaces: Build Environment"
DESCRIPTION = "The KDE GUI addons provide utilities for graphical user interfaces in the areas \
of colors, fonts, text, images, keyboard input. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kguiaddons-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "15a6a93de7c310c9ea9ec1ca72187a0794734f5d365f933c9f2ef9e678412ebbca631101c6b83b5976493eebf73d5af4263e0f7dbde4a66b143a379404f6cd0d"

RPROVIDES:${PN} += "cmake-KF5GuiAddons \
kguiaddons-devel"

RDEPENDS:${PN} += "cmake-Qt5Gui \
extra-cmake-modules \
libKF5GuiAddons5"

inherit rpm
