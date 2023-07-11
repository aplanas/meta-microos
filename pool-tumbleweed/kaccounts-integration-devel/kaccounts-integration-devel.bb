SUMMARY = "KDE Accounts Providers - Development Files"
DESCRIPTION = "Small system to administer web accounts for the sites \
and services across the KDE desktop, including: Google, \
Facebook, Owncloud, IMAP, Jabber and others. Devel files."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kaccounts-integration-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "ebe6f17be76913a4111ebe99e3dd68c3b2a4f70da9ebe12e73078553c7c81a70a53713457ca1e142eed71f6242ba0efa9db6bf5ea62927f10e7c2f0f6c8f0750"

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
