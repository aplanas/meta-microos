SUMMARY = "Video player built with Qt/QML on top of libmpv"
DESCRIPTION = "haruna is a video player built with Qt/QML on top of libmpv."
LICENSE = "CC-BY-4.0 & GPL-3.0-or-later & WTFPL"

PV = "0.11.1"

RPM_NAME = "haruna-0.11.1-1.3.aarch64.rpm"
RPM_HASH = "4733f2302d0a1ab06760401ea428def40ff54e40e1c10a7e000a485c95d2356b69010c289e525b387ae986d79bf46693047752830b3a56fe68d59d88ab0458ed"

RPROVIDES:${PN} += "haruna"

RDEPENDS:${PN} += "breeze5-icons \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5FileMetaData.so.3 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOWidgets.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickControls2.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libavcodec.so.60 \
libavfilter.so.9 \
libavformat.so.60 \
libavutil.so.58 \
libc.so.6 \
libmpv.so.2 \
libstdc++.so.6 \
libswscale.so.7 \
yt-dlp"

inherit rpm
