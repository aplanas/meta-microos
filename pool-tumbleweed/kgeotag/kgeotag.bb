SUMMARY = "A photo geotagging utility"
DESCRIPTION = "KGeoTag is a standalone geotagging program. \
Images can be associated with geographic coordinates \
by different means: On the one hand, a matching with \
GPX encoded geodata can be done, on the other hand, \
the coordinates can be set manually, either via drag \
and drop onto a map, via bookmarks or by manually \
supplying them. The coordinates can be stored in the \
images' Exif header and/or in XMP sidecar files."
LICENSE = "GPL-3.0-only"

PV = "1.3.1"

RPM_NAME = "kgeotag-1.3.1-2.3.aarch64.rpm"
RPM_HASH = "a7e4deaf25fef6a7a2e5bd8e19e8acdff2239404991ac4d939d59f89d2dcfe3fcfb32b0ac5ede854ec049db288d0bdeb74116fc49af86925ea42a5ed23e7615d"

RPROVIDES:${PN} += "application() \
application(org.kde.kgeotag.desktop) \
kgeotag \
kgeotag(aarch-64) \
metainfo() \
metainfo(org.kde.kgeotag.appdata.xml)"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KExiv2.so.15.0.0()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libmarblewidget-qt5.so.28()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
