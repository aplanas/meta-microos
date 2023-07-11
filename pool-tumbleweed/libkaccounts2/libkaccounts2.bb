SUMMARY = "KDE Accounts Providers - System Library"
DESCRIPTION = "Small system to administer web accounts for the sites \
and services across the KDE desktop, including: Google, \
Facebook, Owncloud, IMAP, Jabber and others."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "libkaccounts2-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "4b8be7ff0b947e571bedbdc06e3c53aecdd18d8b629960d1f0991e4d1583a7b2f3998fbe66a8320965726245e17bc312285e1047494e854655b1a44352a0fbf1"

RPROVIDES:${PN} += "libkaccounts.so.2 \
libkaccounts2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libaccounts-qt5.so.1 \
libc.so.6 \
libsignon-qt5.so.1 \
libstdc++.so.6"

inherit rpm
