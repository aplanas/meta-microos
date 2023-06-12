SUMMARY = "Multimedia Player"
DESCRIPTION = "Dragon Player is a simple video player."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "dragonplayer-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "70601ec8ef3d83964254006c109866adcb380b76e81414aa0a2c557a2e0c3df490436604bec6acc3d75ba526dc23e7a84e44591c68d27731befdf10ef48fd698"

RPROVIDES:${PN} += "application() \
application(org.kde.dragonplayer.desktop) \
config(dragonplayer) \
dragonplayer \
dragonplayer(aarch-64) \
dragonplayer5 \
metainfo() \
metainfo(org.kde.dragonplayer.appdata.xml) \
mimehandler(application/x-cd-image) \
mimehandler(video/avi) \
mimehandler(video/mp4) \
mimehandler(video/mpeg) \
mimehandler(video/ogg) \
mimehandler(video/quicktime) \
mimehandler(video/vnd.rn-realvideo) \
mimehandler(video/webm) \
mimehandler(video/x-flic) \
mimehandler(video/x-flv) \
mimehandler(video/x-matroska) \
mimehandler(video/x-ms-asf) \
mimehandler(video/x-ms-wmv) \
mimehandler(video/x-msvideo) \
mimehandler(video/x-ogm+ogg) \
mimehandler(video/x-theora+ogg)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5JobWidgets.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5Parts.so.5()(64bit) \
libKF5Service.so.5()(64bit) \
libKF5Solid.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libphonon4qt5.so.4()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
