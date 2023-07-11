SUMMARY = "Backup program based on KDE Frameworks 5"
DESCRIPTION = "kbackup is a backup program based on KDE Frameworks 5. It allows backing \
folders and files up and setting profiles to exclude or include directories \
or files from the backup. It can save to both local files or remote locations. \
Although GUI based, it also offers an automated, GUI-less mode."
LICENSE = "GPL-2.0-only"

PV = "23.04.3"

RPM_NAME = "kbackup-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "e011e523eca5fdae60f9f694ff40525a5c41c2fc097c5efd3d1e6df4f57f9f9cf6a8859ff80d2180ee2a7deae13668eaf7afafcf77d808f1d0e20a373b857887"

RPROVIDES:${PN} += "kbackup"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Notifications.so.5 \
libKF5Service.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libarchive.so.13 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
