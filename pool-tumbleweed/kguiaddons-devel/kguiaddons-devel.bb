SUMMARY = "Utilities for graphical user interfaces: Build Environment"
DESCRIPTION = "The KDE GUI addons provide utilities for graphical user interfaces in the areas \
of colors, fonts, text, images, keyboard input. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kguiaddons-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "59baeca9b204752520d71ae7807d39160f8745c4571ba122a28e33755b77006f5a5de4abf044ef0e3c9c2f2755706158cf5ab17dfa7f27e98a955618ef711432"

RPROVIDES:${PN} += "cmake-KF5GuiAddons \
kguiaddons-devel"

RDEPENDS:${PN} += "cmake-Qt5Gui \
extra-cmake-modules \
libKF5GuiAddons5"

inherit rpm
