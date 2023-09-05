SUMMARY = "Touch Typing Tutor"
DESCRIPTION = "A KDE program that helps you to learn and practice touch typing."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "ktouch-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "43720dfc3bf5ad26521952cf2b0ba01398f94b5e2f4db9e7e6f77b38791a1f75145dcd92989c6f6330a36e8c7dc69820580f92b60582bfd17696cf84b2a1b658"

RPROVIDES:${PN} += "kde4-ktouch \
ktouch"

RDEPENDS:${PN} += "kdeclarative-components \
kqtquickcharts \
ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5ItemViews.so.5 \
libKF5KCMUtils.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickControls2.so.5 \
libQt5QuickWidgets.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libQt5Xml.so.5 \
libQt5XmlPatterns.so.5 \
libX11.so.6 \
libc.so.6 \
libm.so.6 \
libqt5-qtquickcontrols2 \
libstdc++.so.6 \
libxcb-xkb.so.1 \
libxcb.so.1"

inherit rpm
