SUMMARY = "Daemon for GTK2 and GTK3 Applications Appearance Under KDE"
DESCRIPTION = "kde-gtk-config is a KDED module which configures GTK2 and GTK3 applications \
appearance under KDE."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "5.27.5"

RPM_NAME = "kde-gtk-config5-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "aae79c4ede46fc47fedd8ab9702f0d0688742ec4903ddb6ae1199c0f2d799b8f46fb8f1f8e26be358798b8bd4ba684a165110485a19161c8f3f680996f7837d5"

RPROVIDES:${PN} += "kde-gtk-config \
kde-gtk-config5 \
kde-gtk-config5(aarch-64) \
kde-gtk-config5-gtk2 \
libcolorreload-gtk-module.so()(64bit) \
libwindow-decorations-gtk-module.so()(64bit)"

RDEPENDS:${PN} += "/usr/bin/env \
gsettings-desktop-schemas \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5GuiAddons.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libkdecorations2.so.5()(64bit) \
libkdecorations2private.so.10()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
xsettingsd"

inherit rpm
