SUMMARY = "System Log Viewer Tool"
DESCRIPTION = "This program is developed for use by beginner users, who do not know \
how to find information about their Linux system and how the log files \
are in their computer. But it is also designed for advanced users, who \
want to quickly see problems occurring on their server."
LICENSE = "GPL-2.0-only"

PV = "23.04.3"

RPM_NAME = "ksystemlog-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "0cbba3cd263a31b5f47994fd6c570e9c87d1692dc40294aa7c739ce279af01d7736447eaefb4b3a58fda826d5e6f5ce39cc2ef7ed09a04cdadc5adb7f630547f"

RPROVIDES:${PN} += "ksystemlog \
ksystemlog5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5ItemViews.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOWidgets.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6 \
libsystemd.so.0"

inherit rpm
