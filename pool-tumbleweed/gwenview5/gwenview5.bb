SUMMARY = "Image Viewer by KDE"
DESCRIPTION = "Gwenview is an image viewer by KDE. It features a folder tree window and a file \
list window, providing navigation of file hierarchies."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "gwenview5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "9dbe2fb4c0245f48c375d423ad42072b7a58194297dd9ff4fc78a3a84d60822060410394649c642ed292fa5b7fac4a1ece07ec96eb2a9736f74c6fe1d70ff7b4"

RPROVIDES:${PN} += "application() \
application(org.kde.gwenview.desktop) \
application(org.kde.gwenview_importer.desktop) \
gwenview \
gwenview5 \
gwenview5(aarch-64) \
libgwenviewlib.so.5()(64bit) \
metainfo() \
metainfo(org.kde.gwenview.appdata.xml) \
mimehandler(application/x-krita) \
mimehandler(image/avif) \
mimehandler(image/bmp) \
mimehandler(image/gif) \
mimehandler(image/heif) \
mimehandler(image/jpeg) \
mimehandler(image/jxl) \
mimehandler(image/png) \
mimehandler(image/tiff) \
mimehandler(image/webp) \
mimehandler(image/x-adobe-dng) \
mimehandler(image/x-canon-cr2) \
mimehandler(image/x-canon-crw) \
mimehandler(image/x-eps) \
mimehandler(image/x-fuji-raf) \
mimehandler(image/x-icns) \
mimehandler(image/x-ico) \
mimehandler(image/x-kde-raw) \
mimehandler(image/x-kodak-dcr) \
mimehandler(image/x-kodak-k25) \
mimehandler(image/x-kodak-kdc) \
mimehandler(image/x-minolta-mrw) \
mimehandler(image/x-nikon-nef) \
mimehandler(image/x-olympus-orf) \
mimehandler(image/x-panasonic-rw) \
mimehandler(image/x-panasonic-rw2) \
mimehandler(image/x-pentax-pef) \
mimehandler(image/x-portable-bitmap) \
mimehandler(image/x-portable-graymap) \
mimehandler(image/x-portable-pixmap) \
mimehandler(image/x-psd) \
mimehandler(image/x-sigma-x3f) \
mimehandler(image/x-sony-arw) \
mimehandler(image/x-sony-sr2) \
mimehandler(image/x-sony-srf) \
mimehandler(image/x-tga) \
mimehandler(image/x-webp) \
mimehandler(image/x-xbitmap) \
mimehandler(image/x-xcf) \
mimehandler(image/x-xpixmap) \
mimehandler(inode/directory)"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/env \
ld-linux-aarch64.so.1()(64bit) \
libKF5Activities.so.5()(64bit) \
libKF5Baloo.so.5()(64bit) \
libKF5Completion.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5FileMetaData.so.3()(64bit) \
libKF5GuiAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IconThemes.so.5()(64bit) \
libKF5ItemModels.so.5()(64bit) \
libKF5ItemViews.so.5()(64bit) \
libKF5JobWidgets.so.5()(64bit) \
libKF5KDcraw.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOFileWidgets.so.5()(64bit) \
libKF5KIOGui.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5Parts.so.5()(64bit) \
libKF5Purpose.so.5()(64bit) \
libKF5PurposeWidgets.so.5()(64bit) \
libKF5Service.so.5()(64bit) \
libKF5Solid.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Core5 \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5WaylandClient.so.5()(64bit) \
libQt5WaylandClient.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libcfitsio.so.10()(64bit) \
libexiv2.so.27()(64bit) \
libgcc_s.so.1()(64bit) \
libjpeg.so.8()(64bit) \
libkImageAnnotator.so.0()(64bit) \
liblcms2.so.2()(64bit) \
libm.so.6()(64bit) \
libphonon4qt5.so.4()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libstdc++.so.6()(64bit) \
libtiff.so.6()(64bit) \
libwayland-client.so.0()(64bit)"

inherit rpm
