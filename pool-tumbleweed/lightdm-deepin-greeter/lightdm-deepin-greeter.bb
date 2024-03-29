SUMMARY = "Simple display manager (Deepin Desktop)"
DESCRIPTION = "A LightDM greeter that uses the Deepin Desktop. This is the reference implementation \
of a LightDM greeter based on the Deepin Desktop."
LICENSE = "GPL-3.0+"

PV = "5.5.48"

RPM_NAME = "lightdm-deepin-greeter-5.5.48-1.5.aarch64.rpm"
RPM_HASH = "4933cc7cf2e5cd27a5ac7e5d3eb58ae76f669fa4b95171e17a11f9de0f5d4fcb74640f6aabd07434418f451e5b46e29896fd80861117c5b03fe0ffb6926db834"

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
