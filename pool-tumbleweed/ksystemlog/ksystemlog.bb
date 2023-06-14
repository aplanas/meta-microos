SUMMARY = "System Log Viewer Tool"
DESCRIPTION = "This program is developed for use by beginner users, who do not know \
how to find information about their Linux system and how the log files \
are in their computer. But it is also designed for advanced users, who \
want to quickly see problems occurring on their server."
LICENSE = "GPL-2.0-only"

PV = "23.04.1"

RPM_NAME = "ksystemlog-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "5314073f9a8bfe3a241d1f508571194c05119059c14a156ea41e327d98bae6db652b2351a763e5564c6113827f37c07132d6a716233d1d94fe356eaa261e56d5"

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
