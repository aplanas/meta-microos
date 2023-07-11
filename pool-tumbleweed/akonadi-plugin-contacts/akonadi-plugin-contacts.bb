SUMMARY = "Plugins for personal contact handling"
DESCRIPTION = "This package provides plugins required by PIM applications to read and write contact data."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "akonadi-plugin-contacts-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "80369303d3279e6e234d950dfdc306b6ca947bfa41a93ca667cdd29fe3137dcd9447c4ac583676d9f28eac6cec1337bc8511031f7667efd6d7fb0de55b3bdc67"

RPROVIDES:${PN} += "akonadi-plugin-contacts"

RDEPENDS:${PN} += "akonadi-contact \
ld-linux-aarch64.so.1 \
libKF5Contacts.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKPim5AkonadiContact.so.5 \
libKPim5AkonadiCore.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
