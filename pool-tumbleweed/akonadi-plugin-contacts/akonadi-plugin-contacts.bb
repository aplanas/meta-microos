SUMMARY = "Plugins for personal contact handling"
DESCRIPTION = "This package provides plugins required by PIM applications to read and write contact data."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "akonadi-plugin-contacts-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "e5c3829c4a411e88b6e6a5323671f58dc25d253da06d8f8e399a242a6ae80ccaacffe81175153e4a0abd9b864618768635c32a24c1505086951efae9d28721b7"

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
