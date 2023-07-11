SUMMARY = "Potato drawing editor"
DESCRIPTION = "KTuberling is a nice potato editor for kids. The game intended for \
small children. Of course, it may be suitable for adults who have \
remained young at heart. Eyes, mouths, mustache, and other parts of \
face and goodies can be attached onto a potato-like guy."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "ktuberling-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "7efe7f09a83b8440aae6d38b6c2b56de04a419c4b72943988d6082ae0582af31695d58d87741ae67f63f438871766befbaea8ca821c3ae532a931d66a8248c82"

RPROVIDES:${PN} += "ktuberling \
ktuberling5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5KDEGames.so.7 \
libKF5KIOCore.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5PrintSupport.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
