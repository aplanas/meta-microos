SUMMARY = "Data exporter for KDE PIM applications"
DESCRIPTION = "This package contains utlities needed by KDE PIM applications to export data \
for backup and archival."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "pim-data-exporter-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "fa983badc25a9ee749500395fba2c7c4adcbca74d69785653e66e692d9b6176d0cd1a71d3af7a60896097c7b04a7ba9c353edb9da5ae2e568625b17f4f5cc48d"

RPROVIDES:${PN} += "application() \
application(org.kde.pimdataexporter.desktop) \
libpimdataexporterprivate.so.5()(64bit) \
metainfo() \
metainfo(org.kde.pimdataexporter.appdata.xml) \
pim-data-exporter \
pim-data-exporter(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
kontact \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5Archive.so.5()(64bit) \
libKF5CalendarCore.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5Contacts.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5ItemViews.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOFileWidgets.so.5()(64bit) \
libKF5KIOGui.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5PimCommon.so.5()(64bit) \
libKF5PimCommonAkonadi.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libKPim5AkonadiCore.so.5()(64bit) \
libKPim5AkonadiMime.so.5()(64bit) \
libKPim5AkonadiNotes.so.5()(64bit) \
libKPim5AkonadiWidgets.so.5()(64bit) \
libKPim5IdentityManagement.so.5()(64bit) \
libKPim5MailCommon.so.5()(64bit) \
libKPim5MailTransport.so.5()(64bit) \
libKPim5Mime.so.5()(64bit) \
libKPim5TextEdit.so.5()(64bit) \
libKUserFeedbackCore.so.1()(64bit) \
libKUserFeedbackWidgets.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
