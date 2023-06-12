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

RPROVIDES:${PN} += "application() \
application(org.kde.kdenlive.desktop) \
kdenlive \
kdenlive(aarch-64) \
kdenlive5 \
metainfo() \
metainfo(org.kde.kdenlive.appdata.xml) \
mimehandler(application/x-kdenlive)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5Archive.so.5()(64bit) \
libKF5Bookmarks.so.5()(64bit) \
libKF5Codecs.so.5()(64bit) \
libKF5Completion.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5FileMetaData.so.3()(64bit) \
libKF5GuiAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IconThemes.so.5()(64bit) \
libKF5ItemViews.so.5()(64bit) \
libKF5JobWidgets.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOFileWidgets.so.5()(64bit) \
libKF5KIOGui.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5NewStuffCore.so.5()(64bit) \
libKF5NewStuffWidgets.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5NotifyConfig.so.5()(64bit) \
libKF5Purpose.so.5()(64bit) \
libKF5PurposeWidgets.so.5()(64bit) \
libKF5Solid.so.5()(64bit) \
libKF5TextWidgets.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Multimedia.so.5()(64bit) \
libQt5Multimedia.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5NetworkAuth.so.5()(64bit) \
libQt5NetworkAuth.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5QuickControls2.so.5()(64bit) \
libQt5QuickControls2.so.5(Qt_5)(64bit) \
libQt5QuickWidgets.so.5()(64bit) \
libQt5QuickWidgets.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libmlt++-7.so.7()(64bit) \
libmlt++-7.so.7(MLTPP_0.8.8)(64bit) \
libmlt++-7.so.7(MLTPP_0.9.0)(64bit) \
libmlt++-7.so.7(MLTPP_0.9.2)(64bit) \
libmlt++-7.so.7(MLTPP_0.9.4)(64bit) \
libmlt++-7.so.7(MLTPP_0.9.8)(64bit) \
libmlt++-7.so.7(MLTPP_6.10.0)(64bit) \
libmlt++-7.so.7(MLTPP_6.14.0)(64bit) \
libmlt++-7.so.7(MLTPP_6.22.0)(64bit) \
libmlt++-7.so.7(MLTPP_6.4.0)(64bit) \
libmlt++-7.so.7(MLTPP_6.6.0)(64bit) \
libmlt++-7.so.7(MLTPP_6.8.0)(64bit) \
libmlt++-7.so.7(MLTPP_7.0.0)(64bit) \
libmlt++-7.so.7(MLT_7.12.0)(64bit) \
libmlt++-7.so.7(MLT_7.14.0)(64bit) \
libmlt-7.so.7()(64bit) \
libmlt-7.so.7(MLT_0.8.8)(64bit) \
libmlt-7.so.7(MLT_6.22.0)(64bit) \
libqt5-qtquickcontrols \
libqt5-qtquickcontrols2 \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
melt"

inherit rpm