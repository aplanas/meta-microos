SUMMARY = "KDE Accounts Providers - System Library"
DESCRIPTION = "Small system to administer web accounts for the sites \
and services across the KDE desktop, including: Google, \
Facebook, Owncloud, IMAP, Jabber and others."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "libkaccounts2-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "e70f74ea1501b261f82123b565155e5521e156757874cdf5d32a6aea24239cd0c1aa8000c6d7739385d123d483ab40fa1b8abeda2ad695f15a43b6ac3ab29d6a"

RPROVIDES:${PN} += "libkaccounts.so.2()(64bit) \
libkaccounts2 \
libkaccounts2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libaccounts-qt5.so.1()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libsignon-qt5.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm