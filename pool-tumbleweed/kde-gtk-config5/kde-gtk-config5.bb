SUMMARY = "Daemon for GTK2 and GTK3 Applications Appearance Under KDE"
DESCRIPTION = "kde-gtk-config is a KDED module which configures GTK2 and GTK3 applications \
appearance under KDE."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "5.27.5"

RPM_NAME = "kde-gtk-config5-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "aae79c4ede46fc47fedd8ab9702f0d0688742ec4903ddb6ae1199c0f2d799b8f46fb8f1f8e26be358798b8bd4ba684a165110485a19161c8f3f680996f7837d5"

RPROVIDES:${PN} += "kde-gtk-config \
kde-gtk-config5 \
kde-gtk-config5-gtk2 \
libcolorreload-gtk-module.so \
libwindow-decorations-gtk-module.so"

RDEPENDS:${PN} += "/usr/bin/env \
gsettings-desktop-schemas \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5GuiAddons.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Svg.so.5 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libkdecorations2.so.5 \
libkdecorations2private.so.10 \
libstdc++.so.6 \
xsettingsd"

inherit rpm
