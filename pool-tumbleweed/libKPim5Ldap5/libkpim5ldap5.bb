SUMMARY = "KDE PIM Libraries: LDAP support"
DESCRIPTION = "This package provides LDAP support for KDE PIM applications"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libKPim5Ldap5-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "3e1f60adbe82c4a4cf4fc31adb5dc69a0f7d744eccfc04d1ee7ed10f4152202df5be117b24d0e7bfc4031dfcd5711a61eaacc842f56cb4a19d8d76d6aa214961"

RPROVIDES:${PN} += "libKPim5Ldap.so.5 \
libKPim5Ldap5"

RDEPENDS:${PN} += "/sbin/ldconfig \
kldap \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
liblber.so.2 \
libldap.so.2 \
libqt5keychain.so.1 \
libsasl2.so.3 \
libstdc++.so.6"

inherit rpm
