SUMMARY = "Certificate manager and GUI for OpenPGP and CMS cryptography"
DESCRIPTION = "Kleopatra is a certificate manager and GUI for OpenPGP and CMS cryptography."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kleopatra-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "cdb90c48c560fa2f6b533100991bec87b386feee1401e1afd548fee6e021abc05edf087a3b0ef1e2e9f0d5e0a8f52129ba9e4f56f58c9b5f0b148326b9b304d0"

RPROVIDES:${PN} += "kleopatra \
kleopatra5 \
libkleopatraclientcore.so.1 \
libkleopatraclientgui.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libKF5Codecs.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5ItemModels.so.5 \
libKF5Notifications.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libKPim5Libkleo.so.5 \
libKPim5Mime.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libassuan.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libgpg-error.so.0 \
libgpgme.so.11 \
libgpgmepp.so.6 \
libqgpgme.so.15 \
libstdc++.so.6"

inherit rpm
