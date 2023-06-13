SUMMARY = "Backup program based on KDE Frameworks 5"
DESCRIPTION = "kbackup is a backup program based on KDE Frameworks 5. It allows backing \
folders and files up and setting profiles to exclude or include directories \
or files from the backup. It can save to both local files or remote locations. \
Although GUI based, it also offers an automated, GUI-less mode."
LICENSE = "GPL-2.0-only"

PV = "23.04.1"

RPM_NAME = "kbackup-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "46983d82b970e9608015638985890f8287fac5080c051ca96661fa25d75c9fc298902da2ad9346ce38405272af251a5a38a097a7059c997b9b1c7e7692c847e1"

RPROVIDES:${PN} += "application() \
application(org.kde.kbackup.desktop) \
kbackup \
kbackup(aarch-64) \
metainfo() \
metainfo(org.kde.kbackup.appdata.xml) \
mimehandler(text/x-kbp)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libKF5Archive.so.5()(64bit) \
libKF5Completion.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5GuiAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IconThemes.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOGui.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5Service.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libarchive.so.13()(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
