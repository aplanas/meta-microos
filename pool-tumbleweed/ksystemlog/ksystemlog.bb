SUMMARY = "System Log Viewer Tool"
DESCRIPTION = "This program is developed for use by beginner users, who do not know \
how to find information about their Linux system and how the log files \
are in their computer. But it is also designed for advanced users, who \
want to quickly see problems occurring on their server."
LICENSE = "GPL-2.0-only"

PV = "23.08.0"

RPM_NAME = "ksystemlog-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "11d42f911ae9a5b9f8476357d01def136e2ccf286971561ee49d2efad4d851bbc68cbd1c831b113e4be297162923fce74c6ab54858b73606ac49a755bbbe7f16"

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
