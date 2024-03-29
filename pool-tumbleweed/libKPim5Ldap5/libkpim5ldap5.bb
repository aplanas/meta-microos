SUMMARY = "KDE PIM Libraries: LDAP support"
DESCRIPTION = "This package provides LDAP support for KDE PIM applications"
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libKPim5Ldap5-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "26db68bfe5ff7e4129db9211c3eac4d04a13a92faf960826ddf6b9280f3b51d6a93b21aad435e1637f1494f534c7f790941d0e6dc8e040916eeb69e2c4780f67"

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
