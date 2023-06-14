SUMMARY = "Deepin File Manager libraries"
DESCRIPTION = "This package contains the libraries for deepin-file-manager"
LICENSE = "GPL-3.0-or-later & MIT"

PV = "5.6.4"

RPM_NAME = "libdde-file-manager5-5.6.4-3.7.aarch64.rpm"
RPM_HASH = "03f861abb08e4cda9eeb16545f6122652a6876db89245307faed5dd0e4a093b2ff77a0d10d664c62b67e94f56dff5ce89406d9edcb5539883a90909252ba8cea"

RPROVIDES:${PN} += "libdde-file-manager.so.5 \
libdde-file-manager5"

RDEPENDS:${PN} += "/sbin/ldconfig \
libKF5Codecs.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Sql.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libQt5Xdg.so.3 \
libX11.so.6 \
libc.so.6 \
libcrypto.so.3 \
libdfm-extension.so.5 \
libdframeworkdbus.so.2 \
libdisomaster.so.1 \
libdocparser.so.1 \
libdtkcore.so.5 \
libdtkgui.so.5 \
libdtkwidget.so.5 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libgio-qt.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjemalloc.so.2 \
liblucene++-contrib.so.0 \
liblucene++.so.0 \
libm.so.6 \
libmediainfo.so.0 \
libpolkit-qt5-core-1.so.1 \
libpoppler-cpp.so.0 \
libsecret-1.so.0 \
libstdc++.so.6 \
libudisks2-qt5.so.0 \
libz.so.1"

inherit rpm
