SUMMARY = "KDE Accounts Providers - Development Files"
DESCRIPTION = "Small system to administer web accounts for the sites \
and services across the KDE desktop, including: Google, \
Facebook, Owncloud, IMAP, Jabber and others. Devel files."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kaccounts-integration-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "d7958cc1030f7b5d722c33fcda3d85ac261022bf9a051e98998ce25eebc0d9ade2e38c2c487af61321d3ea3ac810b1a41fe6d2f1bd9fcad18a3e08737620ff11"

RPROVIDES:${PN} += "cmake-KAccounts \
kaccounts-integration-devel"

RDEPENDS:${PN} += "cmake-AccountsQt5 \
cmake-KF5CoreAddons \
cmake-Qt5Core \
intltool \
libkaccounts2 \
libsignon-qt5-devel \
pkgconfig-libaccounts-glib"

inherit rpm
