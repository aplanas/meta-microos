SUMMARY = "A Personal Finance Manager by KDE"
DESCRIPTION = "KMyMoney is a Personal Finance Manager by KDE. It operates \
similar to Quicken, supports various account types, categorization \
of expenses, multiple currencies, online banking support via QIF, \
OFX and HBCI, budgeting and a rich set of reports."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "5.1.3"

RPM_NAME = "kmymoney-5.1.3-2.10.aarch64.rpm"
RPM_HASH = "8c2a127d53194feb30a6e542a47ed3ee299b5fbeec77b0ca7d0e0feb93ed662171bdc5bbfbe86a43c091ef2a44c5f198a6caf6bf9f6ed3f32dbdb1dba94b6d96"

RPROVIDES:${PN} += "kmymoney \
kmymoney-doc \
kmymoney5 \
libkmm-csvimportercore.so.5 \
libkmm-icons.so.5 \
libkmm-menus.so.5 \
libkmm-models.so.5 \
libkmm-mymoney.so.5 \
libkmm-payeeidentifier.so.5 \
libkmm-plugin.so.5 \
libkmm-printer.so.5 \
libkmm-settings.so.5 \
libkmm-widgets.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/perl \
ld-linux-aarch64.so.1 \
libKChart.so.2 \
libKF5Activities.so.5 \
libKF5Archive.so.5 \
libKF5Codecs.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5Contacts.so.5 \
libKF5CoreAddons.so.5 \
libKF5Holidays.so.5 \
libKF5I18n.so.5 \
libKF5ItemModels.so.5 \
libKF5ItemViews.so.5 \
libKF5JobWidgets.so.5 \
libKF5KCMUtils.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Notifications.so.5 \
libKF5Service.so.5 \
libKF5SonnetUi.so.5 \
libKF5TextWidgets.so.5 \
libKF5Wallet.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libKPim5AkonadiCore.so.5 \
libKPim5IdentityManagement.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5QuickWidgets.so.5 \
libQt5Sql.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libalkimia5.so.8 \
libaqbanking.so.44 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libgpgmepp.so.6 \
libgwengui-cpp.so.79 \
libgwengui-qt5.so.79 \
libgwenhywfar.so.79 \
libical.so.3 \
libm.so.6 \
libofx.so.7 \
libpython3.10.so.1.0 \
libsqlcipher-3.41.2.so.0 \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2"

inherit rpm
