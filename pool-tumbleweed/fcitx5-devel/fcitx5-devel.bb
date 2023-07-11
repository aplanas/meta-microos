SUMMARY = "Development files for fcitx5"
DESCRIPTION = "This package provides development files for fcitx5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.23"

RPM_NAME = "fcitx5-devel-5.0.23-1.2.aarch64.rpm"
RPM_HASH = "002031bf8a75226b74c7efdaf973ba19c754269ebaf620571138ec2cbebb49f4b935fac2f267d83c934b2db1d2d5d3af110f1fe0d3d9e13b33ccdf878e2a5c2e"

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
