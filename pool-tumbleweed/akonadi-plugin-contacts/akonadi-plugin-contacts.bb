SUMMARY = "Plugins for personal contact handling"
DESCRIPTION = "This package provides plugins required by PIM applications to read and write contact data."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "akonadi-plugin-contacts-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "5317b34825cbac480c3dd506c2d4c1915e1b2db1e3fe919662dc5ed3a56c8184db8ce702bccc86d11b12373b66ee8c12bb68c04e59c27540f8e4814410b99ac2"

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
