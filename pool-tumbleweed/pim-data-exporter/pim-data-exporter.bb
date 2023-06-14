SUMMARY = "Data exporter for KDE PIM applications"
DESCRIPTION = "This package contains utlities needed by KDE PIM applications to export data \
for backup and archival."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "pim-data-exporter-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "fa983badc25a9ee749500395fba2c7c4adcbca74d69785653e66e692d9b6176d0cd1a71d3af7a60896097c7b04a7ba9c353edb9da5ae2e568625b17f4f5cc48d"

RPROVIDES:${PN} += "libpimdataexporterprivate.so.5 \
pim-data-exporter"

RDEPENDS:${PN} += "/sbin/ldconfig \
kontact \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5CalendarCore.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5Contacts.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5ItemViews.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5KIOGui.so.5 \
libKF5Notifications.so.5 \
libKF5PimCommon.so.5 \
libKF5PimCommonAkonadi.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libKPim5AkonadiCore.so.5 \
libKPim5AkonadiMime.so.5 \
libKPim5AkonadiNotes.so.5 \
libKPim5AkonadiWidgets.so.5 \
libKPim5IdentityManagement.so.5 \
libKPim5MailCommon.so.5 \
libKPim5MailTransport.so.5 \
libKPim5Mime.so.5 \
libKPim5TextEdit.so.5 \
libKUserFeedbackCore.so.1 \
libKUserFeedbackWidgets.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
