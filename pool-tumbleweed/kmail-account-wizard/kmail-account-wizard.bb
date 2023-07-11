SUMMARY = "Account wizard for KMail"
DESCRIPTION = "An application which assists you with the configuration of accounts in KMail."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "kmail-account-wizard-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "ac60bd9c697a79531a4f75c34fb861eb49444b5604ee083b6caa52ad9e152564ab0871235001c2e3a4c915c953569eb3f7d05fb2e5b8c86ea002cc887c20c96f"

RPROVIDES:${PN} += "kmail-account-wizard"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Codecs.so.5 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5KCMUtils.so.5 \
libKF5KIOCore.so.5 \
libKF5KrossCore.so.5 \
libKF5NewStuffCore.so.5 \
libKF5Notifications.so.5 \
libKF5PimCommon.so.5 \
libKF5Wallet.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libKPim5AkonadiCore.so.5 \
libKPim5AkonadiMime.so.5 \
libKPim5AkonadiWidgets.so.5 \
libKPim5IdentityManagement.so.5 \
libKPim5Ldap.so.5 \
libKPim5Libkdepim.so.5 \
libKPim5Libkleo.so.5 \
libKPim5MailTransport.so.5 \
libKPim5MailTransportAkonadi.so.5 \
libKPim5Mime.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libgpgmepp.so.6 \
libqgpgme.so.15 \
libstdc++.so.6"

inherit rpm
