SUMMARY = "Simple display manager (Deepin Desktop)"
DESCRIPTION = "A LightDM greeter that uses the Deepin Desktop. This is the reference implementation \
of a LightDM greeter based on the Deepin Desktop."
LICENSE = "GPL-3.0+"

PV = "5.5.48"

RPM_NAME = "lightdm-deepin-greeter-5.5.48-1.4.aarch64.rpm"
RPM_HASH = "fae73e6d8500c5d86d60ebb1c1bdd44be3063744b66f1a00e78cb6b73cf13c76a03707df241414b6389e23d34248dcb0360b292b6827fdf3723024f38b0cfe3a"

RPROVIDES:${PN} += "config-lightdm-deepin-greeter \
lightdm-deepin-greeter"

RDEPENDS:${PN} += "/usr/bin/bash \
deepin-start \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libQt5Xml.so.5 \
libX11.so.6 \
libXcursor.so.1 \
libXfixes.so.3 \
libXi.so.6 \
libXrandr.so.2 \
libXtst.so.6 \
libc.so.6 \
libdframeworkdbus.so.2 \
libdtkcore.so.5 \
libdtkgui.so.5 \
libdtkwidget.so.5 \
libgcc-s.so.1 \
libgnome-keyring0 \
libgsettings-qt.so.1 \
liblightdm-qt5-3.so.0 \
libpam.so.0 \
libstdc++.so.6 \
lightdm"

inherit rpm
