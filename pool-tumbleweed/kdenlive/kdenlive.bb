SUMMARY = "Non-linear video editor"
DESCRIPTION = "Kdenlive is a non-linear video editor for GNU/Linux and FreeBSD, which supports \
DV, AVCHD (experimental support) and HDV editing. Kdenlive relies on several \
other open source projects, such as FFmpeg and the MLT video framework. It was \
designed to answer all needs, from basic video editing to semi-professional \
work."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.1"

RPM_NAME = "kdenlive-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "4f35928f714d3b2692d6eddc8e35873cc5df728c9dc37927554fbfecd7a77ce5a02b1d9099f48f61073a4649e07a922d673a86661d70100c711f20a44a324d79"

RPROVIDES:${PN} += "kdenlive \
kdenlive5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5Bookmarks.so.5 \
libKF5Codecs.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5FileMetaData.so.3 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5ItemViews.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5NewStuffCore.so.5 \
libKF5NewStuffWidgets.so.5 \
libKF5Notifications.so.5 \
libKF5NotifyConfig.so.5 \
libKF5Purpose.so.5 \
libKF5PurposeWidgets.so.5 \
libKF5Solid.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Network.so.5 \
libQt5NetworkAuth.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickControls2.so.5 \
libQt5QuickWidgets.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libm.so.6 \
libmlt++-7.so.7 \
libmlt-7.so.7 \
libqt5-qtquickcontrols \
libqt5-qtquickcontrols2 \
libstdc++.so.6 \
melt"

inherit rpm
