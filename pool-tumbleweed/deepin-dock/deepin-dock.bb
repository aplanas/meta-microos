SUMMARY = "Deepin dock"
DESCRIPTION = "deepin desktop-environment - dock module"
LICENSE = "LGPL-3.0-or-later"

PV = "5.5.65"

RPM_NAME = "deepin-dock-5.5.65-1.3.aarch64.rpm"
RPM_HASH = "5cbbe95ee6beb4132c645fce93a70255b707c2db438691ebcd8918be5a07b3240f8bbc9089fdd85bc28430a3f147c2af8c1591185988e71627864c53f44902e4"

RPROVIDES:${PN} += "config(deepin-dock) \
deepin-dock \
deepin-dock(aarch-64) \
libairplane-mode.so()(64bit) \
libbluetooth.so()(64bit) \
libdatetime.so()(64bit) \
libdcc-dock-plugin.so()(64bit) \
libkeyboard-layout.so()(64bit) \
libmultitasking.so()(64bit) \
libonboard.so()(64bit) \
liboverlay-warning.so()(64bit) \
libpower.so()(64bit) \
libshow-desktop.so()(64bit) \
libshutdown.so()(64bit) \
libsound.so()(64bit) \
libtrash.so()(64bit) \
libtray.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Concurrent.so.5()(64bit) \
libQt5Concurrent.so.5(Qt_5)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libX11.so.6()(64bit) \
libXcursor.so.1()(64bit) \
libXext.so.6()(64bit) \
libXtst.so.6()(64bit) \
libc.so.6()(64bit) \
libdbusmenu-qt5.so.2()(64bit) \
libdccwidgets.so()(64bit) \
libdframeworkdbus.so.2()(64bit) \
libdtkcore.so.5()(64bit) \
libdtkgui.so.5()(64bit) \
libdtkwidget.so.5()(64bit) \
libgcc_s.so.1()(64bit) \
libgsettings-qt.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libxcb-composite.so.0()(64bit) \
libxcb-ewmh.so.2()(64bit) \
libxcb-image.so.0()(64bit) \
libxcb.so.1()(64bit)"

inherit rpm
