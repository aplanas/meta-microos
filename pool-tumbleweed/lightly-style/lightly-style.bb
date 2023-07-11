SUMMARY = "Lightly kstyle theme and color schemes"
DESCRIPTION = "Lightly is a fork of breeze theme style that aims to be visually modern and minimalistic. \
 \
This package contains the kstyle theme and color schemes of Lightly."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.1"

RPM_NAME = "lightly-style-0.4.1-2.8.aarch64.rpm"
RPM_HASH = "b9f4bac08e13514e731a4ca1baa00c888788845fc012c4dcc6152146dd8056cb36fc0f563ad1ca82292644ba87a91da1b96a88d46609e72bc3b573dd69fb8bca"

RPROVIDES:${PN} += "cmake-Lightly \
lightly-style"

RDEPENDS:${PN} += "kconf-update5 \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5Style.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
liblightlycommon5.so.5 \
libm.so.6 \
libstdc++.so.6 \
libxcb.so.1"

inherit rpm
