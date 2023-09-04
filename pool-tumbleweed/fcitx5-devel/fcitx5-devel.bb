SUMMARY = "Development files for fcitx5"
DESCRIPTION = "This package provides development files for fcitx5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.1.0"

RPM_NAME = "fcitx5-devel-5.1.0-1.1.aarch64.rpm"
RPM_HASH = "c71d31d49e7c864630e3c375ab3f4f92208c92903c828b096c297b4e71dea2f84874c60b6d0c36c52eea4acd783653168face9f55dda716a6b10e5e09ebc9269"

RPROVIDES:${PN} += "cmake-Fcitx5Config \
cmake-Fcitx5Core \
cmake-Fcitx5Module \
cmake-Fcitx5ModuleClipboard \
cmake-Fcitx5ModuleDBus \
cmake-Fcitx5ModuleEmoji \
cmake-Fcitx5ModuleNotificationItem \
cmake-Fcitx5ModuleNotifications \
cmake-Fcitx5ModuleQuickPhrase \
cmake-Fcitx5ModuleSpell \
cmake-Fcitx5ModuleTestFrontend \
cmake-Fcitx5ModuleTestIM \
cmake-Fcitx5ModuleUnicode \
cmake-Fcitx5ModuleWayland \
cmake-Fcitx5ModuleXCB \
cmake-Fcitx5Utils \
fcitx-devel \
fcitx5-devel \
pkgconfig-Fcitx5Config \
pkgconfig-Fcitx5Core \
pkgconfig-Fcitx5Module \
pkgconfig-Fcitx5Utils \
rpm-macro--fcitx5-addondir \
rpm-macro--fcitx5-datadir \
rpm-macro--fcitx5-imconfdir \
rpm-macro--fcitx5-libdir \
rpm-macro--fcitx5-libexecdir \
rpm-macro--fcitx5-qt5dir"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
fcitx5 \
libFcitx5Config6 \
libFcitx5Core7 \
libFcitx5Utils2 \
pkgconfig-Fcitx5Config \
pkgconfig-Fcitx5Core \
pkgconfig-Fcitx5Utils"

inherit rpm
