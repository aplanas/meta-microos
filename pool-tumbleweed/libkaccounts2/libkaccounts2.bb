SUMMARY = "KDE Accounts Providers - System Library"
DESCRIPTION = "Small system to administer web accounts for the sites \
and services across the KDE desktop, including: Google, \
Facebook, Owncloud, IMAP, Jabber and others."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "libkaccounts2-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "c5b87884b6edd5f2edafd1d942c5e796056bd9c030b0eaea6df3daa65b3a8dd762bae5d3bec0250b617b97871bd64629de619402436b11d73f9ac2befadca828"

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
