SUMMARY = "Certificate manager and GUI for OpenPGP and CMS cryptography"
DESCRIPTION = "Kleopatra is a certificate manager and GUI for OpenPGP and CMS cryptography."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kleopatra-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "952bf7187985859328a9e1482bedbe8e4e90cdae0809eb0d059a1523163d2bc5a0c796f5f1f2b516b377f7b4d02e0e6a3632220441c02f5268cb0e0c3e74b99e"

RPROVIDES:${PN} += "application() \
application(kleopatra_import.desktop) \
application(org.kde.kleopatra.desktop) \
kleopatra \
kleopatra(aarch-64) \
kleopatra5 \
libkleopatraclientcore.so.1()(64bit) \
libkleopatraclientgui.so.1()(64bit) \
metainfo() \
metainfo(org.kde.kleopatra.appdata.xml) \
mimehandler(application/pgp-keys) \
mimehandler(application/pkcs7-mime) \
mimehandler(application/vnd.kde.kleopatra.keygroup) \
mimehandler(application/x-pkcs12) \
mimehandler(application/x-x509-ca-cert)"

RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libKF5Codecs.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IconThemes.so.5()(64bit) \
libKF5ItemModels.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5TextWidgets.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libKPim5Libkleo.so.5()(64bit) \
libKPim5Mime.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libassuan.so.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgpg-error.so.0()(64bit) \
libgpgme.so.11()(64bit) \
libgpgmepp.so.6()(64bit) \
libqgpgme.so.15()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
