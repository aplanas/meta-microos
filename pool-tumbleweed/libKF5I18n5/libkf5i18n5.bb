SUMMARY = "KDE Gettext-based UI text internationalization"
DESCRIPTION = "KI18n provides functionality for internationalizing user interface text \
in applications, based on the GNU Gettext translation system. \
It wraps the standard Gettext functionality, so that the programmers \
and translators can use the familiar Gettext tools and workflows."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5I18n5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "a4d73bd6b8d4324c081216ed3349fbbab19eaa477924c797a571d80a7da97af58144f170fcfbc3c31f71e2c9a322110d526ac357ee903feea52aae9514d3d29c"

RPROVIDES:${PN} += "libKF5I18n.so.5 \
libKF5I18n5 \
libKF5I18nLocaleData.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
iso-codes \
iso-codes-lang \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5Qml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
