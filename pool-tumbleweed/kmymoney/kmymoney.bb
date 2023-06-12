SUMMARY = "A Personal Finance Manager by KDE"
DESCRIPTION = "KMyMoney is a Personal Finance Manager by KDE. It operates \
similar to Quicken, supports various account types, categorization \
of expenses, multiple currencies, online banking support via QIF, \
OFX and HBCI, budgeting and a rich set of reports."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "5.1.3"

RPM_NAME = "kmymoney-5.1.3-2.10.aarch64.rpm"
RPM_HASH = "8c2a127d53194feb30a6e542a47ed3ee299b5fbeec77b0ca7d0e0feb93ed662171bdc5bbfbe86a43c091ef2a44c5f198a6caf6bf9f6ed3f32dbdb1dba94b6d96"

RPROVIDES:${PN} += "application() \
application(org.kde.kmymoney.desktop) \
kmymoney \
kmymoney(aarch-64) \
kmymoney-doc \
kmymoney5 \
libkmm_csvimportercore.so.5()(64bit) \
libkmm_icons.so.5()(64bit) \
libkmm_menus.so.5()(64bit) \
libkmm_models.so.5()(64bit) \
libkmm_mymoney.so.5()(64bit) \
libkmm_payeeidentifier.so.5()(64bit) \
libkmm_plugin.so.5()(64bit) \
libkmm_printer.so.5()(64bit) \
libkmm_settings.so.5()(64bit) \
libkmm_widgets.so.5()(64bit) \
metainfo() \
metainfo(org.kde.kmymoney.appdata.xml) \
mimehandler(application/vnd.intu.qfx) \
mimehandler(application/x-kmymoney) \
mimehandler(application/x-ofx)"
RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKChart.so.2()(64bit) \
libKF5Activities.so.5()(64bit) \
libKF5Archive.so.5()(64bit) \
libKF5Codecs.so.5()(64bit) \
libKF5Completion.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5Contacts.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Holidays.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5ItemModels.so.5()(64bit) \
libKF5ItemViews.so.5()(64bit) \
libKF5JobWidgets.so.5()(64bit) \
libKF5KCMUtils.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOFileWidgets.so.5()(64bit) \
libKF5KIOGui.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5Service.so.5()(64bit) \
libKF5SonnetUi.so.5()(64bit) \
libKF5TextWidgets.so.5()(64bit) \
libKF5Wallet.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libKPim5AkonadiCore.so.5()(64bit) \
libKPim5IdentityManagement.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Core.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5QuickWidgets.so.5()(64bit) \
libQt5QuickWidgets.so.5(Qt_5)(64bit) \
libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libQt5Sql.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5WebEngineWidgets.so.5()(64bit) \
libQt5WebEngineWidgets.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libalkimia5.so.8()(64bit) \
libaqbanking.so.44()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgmp.so.10()(64bit) \
libgpgmepp.so.6()(64bit) \
libgwengui-cpp.so.79()(64bit) \
libgwengui-qt5.so.79()(64bit) \
libgwenhywfar.so.79()(64bit) \
libical.so.3()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libofx.so.7()(64bit) \
libpython3.10.so.1.0()(64bit) \
libsqlcipher-3.41.2.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
qt5qmlimport(QtQuick.2)"

inherit rpm
