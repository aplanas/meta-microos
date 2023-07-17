SUMMARY = "Video player built with Qt/QML on top of libmpv"
DESCRIPTION = "haruna is a video player built with Qt/QML on top of libmpv."
LICENSE = "CC-BY-4.0 & GPL-3.0-or-later & WTFPL"

PV = "0.11.2"

RPM_NAME = "haruna-0.11.2-1.1.aarch64.rpm"
RPM_HASH = "29a70d22485ccc3507d2a7b25965ea52bfb80219b449758cbe03e97fcd80142ae3da53d73a73cecab901cfbaac277e8dec3b486b3abdcd87f4a15ccccfe5588f"

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
