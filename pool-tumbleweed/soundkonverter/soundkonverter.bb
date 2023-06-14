SUMMARY = "Audio file converter, CD ripper and Replay Gain tool"
DESCRIPTION = "soundKonverter is a frontend to various audio converters."
LICENSE = "GPL-2.0-only"

PV = "3.0.1"

RPM_NAME = "soundkonverter-3.0.1-1.14.aarch64.rpm"
RPM_HASH = "f2a63814e62041e192939828775dd44e574079537865dc3b044f79b36cd0985ed3854edd2bcf0df7cf6b231db5741f79929feb017a71f10b28353dad0e257192"

RPROVIDES:${PN} += "libsoundkonvertercore.so \
soundkonverter"

RDEPENDS:${PN} += "/sbin/ldconfig \
cdparanoia \
flac \
ld-linux-aarch64.so.1 \
libKF5Cddb.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KDELibs4Support.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Notifications.so.5 \
libKF5Service.so.5 \
libKF5Solid.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libcdda-interface.so.0 \
libcdda-paranoia.so.0 \
libm.so.6 \
libphonon4qt5.so.4 \
libstdc++.so.6 \
libtag.so.1 \
speex \
vorbis-tools \
wavpack"

inherit rpm
