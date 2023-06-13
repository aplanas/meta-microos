SUMMARY = "KDE PIM Libraries: LDAP support"
DESCRIPTION = "This package provides LDAP support for KDE PIM applications"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5Ldap5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "bb0a35aec0df97ca4bacfc1a003aac4c2b054a05e29496a0241c1b42417a270fd0667dac3d4c2c03e3278d2b0f96870030532df0a2f8535b942bc0b3169d41f4"

RPROVIDES:${PN} += "libKPim5Ldap.so.5()(64bit) \
libKPim5Ldap5 \
libKPim5Ldap5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
kldap \
ld-linux-aarch64.so.1()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
liblber.so.2()(64bit) \
libldap.so.2()(64bit) \
libqt5keychain.so.1()(64bit) \
libsasl2.so.3()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
