SUMMARY = "Account wizard for KMail"
DESCRIPTION = "An application which assists you with the configuration of accounts in KMail."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "kmail-account-wizard-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "ea2869579f0a61ae9acbc5ce27029d7df0006b6d42fbb2c4b6d5a02c9a1e666684591cf079c1bd159cffea3b4305b7f19c002c52af11051a71b11bef88ae2007"

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
libKPim5Mime.so.5 \
libKPim5PimCommon.so.5 \
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
