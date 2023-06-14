SUMMARY = "Image Viewer by KDE"
DESCRIPTION = "Gwenview is an image viewer by KDE. It features a folder tree window and a file \
list window, providing navigation of file hierarchies."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "gwenview5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "9dbe2fb4c0245f48c375d423ad42072b7a58194297dd9ff4fc78a3a84d60822060410394649c642ed292fa5b7fac4a1ece07ec96eb2a9736f74c6fe1d70ff7b4"

RPROVIDES:${PN} += "gwenview \
gwenview5 \
libgwenviewlib.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/env \
ld-linux-aarch64.so.1 \
libKF5Activities.so.5 \
libKF5Baloo.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5FileMetaData.so.3 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5ItemModels.so.5 \
libKF5ItemViews.so.5 \
libKF5JobWidgets.so.5 \
libKF5KDcraw.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Notifications.so.5 \
libKF5Parts.so.5 \
libKF5Purpose.so.5 \
libKF5PurposeWidgets.so.5 \
libKF5Service.so.5 \
libKF5Solid.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Svg.so.5 \
libQt5WaylandClient.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libc.so.6 \
libcfitsio.so.10 \
libexiv2.so.27 \
libgcc-s.so.1 \
libjpeg.so.8 \
libkImageAnnotator.so.0 \
liblcms2.so.2 \
libm.so.6 \
libphonon4qt5.so.4 \
libpng16.so.16 \
libstdc++.so.6 \
libtiff.so.6 \
libwayland-client.so.0"

inherit rpm
