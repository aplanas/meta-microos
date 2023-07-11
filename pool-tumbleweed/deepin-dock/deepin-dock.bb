SUMMARY = "Deepin dock"
DESCRIPTION = "deepin desktop-environment - dock module"
LICENSE = "LGPL-3.0-or-later"

PV = "5.5.65"

RPM_NAME = "deepin-dock-5.5.65-1.4.aarch64.rpm"
RPM_HASH = "bb7392e91ed735783296283bab87075618f1aaefa6060a8e33142ee74e25f74cbd0022e466a67c3f2cb2f9af1c66e66833d69087cd8489d5fbea88605bbc5c02"

RPROVIDES:${PN} += "config-deepin-dock \
deepin-dock \
libairplane-mode.so \
libbluetooth.so \
libdatetime.so \
libdcc-dock-plugin.so \
libkeyboard-layout.so \
libmultitasking.so \
libonboard.so \
liboverlay-warning.so \
libpower.so \
libshow-desktop.so \
libshutdown.so \
libsound.so \
libtrash.so \
libtray.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Concurrent.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libXcursor.so.1 \
libXext.so.6 \
libXtst.so.6 \
libc.so.6 \
libdbusmenu-qt5.so.2 \
libdccwidgets.so \
libdframeworkdbus.so.2 \
libdtkcore.so.5 \
libdtkgui.so.5 \
libdtkwidget.so.5 \
libgcc-s.so.1 \
libgsettings-qt.so.1 \
libstdc++.so.6 \
libxcb-composite.so.0 \
libxcb-ewmh.so.2 \
libxcb-image.so.0 \
libxcb.so.1"

inherit rpm
