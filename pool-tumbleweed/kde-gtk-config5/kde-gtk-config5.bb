SUMMARY = "Daemon for GTK2 and GTK3 Applications Appearance Under KDE"
DESCRIPTION = "kde-gtk-config is a KDED module which configures GTK2 and GTK3 applications \
appearance under KDE."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "5.27.6"

RPM_NAME = "kde-gtk-config5-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "7a2d5c3a1f7ff5e08ed190a2e35c7b7695342ef2856bffed2aac005792a8ac7105a18103b03d8c8b354a4362291a68e3891f3cd2a49bf4e335110077e95128db"

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
