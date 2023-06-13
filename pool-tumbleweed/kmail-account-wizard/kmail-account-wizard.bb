SUMMARY = "Account wizard for KMail"
DESCRIPTION = "An application which assists you with the configuration of accounts in KMail."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "kmail-account-wizard-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "8a8c11fcf952b506526cc78353c6c90f04153735d3303e891b282efb7c0a06a15a023c2d4cdd9b7948e01709576075237bbbfddfc41560e6774025b164eee3ce"

RPROVIDES:${PN} += "application() \
application(org.kde.accountwizard.desktop) \
kmail-account-wizard \
kmail-account-wizard(aarch-64) \
mimehandler(application/x-accountwizard-package)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libKF5Codecs.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KCMUtils.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KrossCore.so.5()(64bit) \
libKF5NewStuffCore.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5PimCommon.so.5()(64bit) \
libKF5Wallet.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libKPim5AkonadiCore.so.5()(64bit) \
libKPim5AkonadiMime.so.5()(64bit) \
libKPim5AkonadiWidgets.so.5()(64bit) \
libKPim5IdentityManagement.so.5()(64bit) \
libKPim5Ldap.so.5()(64bit) \
libKPim5Libkdepim.so.5()(64bit) \
libKPim5Libkleo.so.5()(64bit) \
libKPim5MailTransport.so.5()(64bit) \
libKPim5MailTransportAkonadi.so.5()(64bit) \
libKPim5Mime.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgpgmepp.so.6()(64bit) \
libqgpgme.so.15()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
