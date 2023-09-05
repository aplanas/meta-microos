SUMMARY = "Data exporter for KDE PIM applications"
DESCRIPTION = "This package contains utlities needed by KDE PIM applications to export data \
for backup and archival."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "pim-data-exporter-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "2e4b6f52edcca7a5e1ba8c383f596b02047cb875b1cab6fa14b0c16d8984fb9d157ea5b0181a18173dc73f0e3e5f83dfcd422c931e9505fac5fa2ea9fe14acfc"

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
libKPim5PimCommon.so.5 \
libKPim5PimCommonAkonadi.so.5 \
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
