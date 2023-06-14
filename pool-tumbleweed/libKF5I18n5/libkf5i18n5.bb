SUMMARY = "KDE Gettext-based UI text internationalization"
DESCRIPTION = "KI18n provides functionality for internationalizing user interface text \
in applications, based on the GNU Gettext translation system. \
It wraps the standard Gettext functionality, so that the programmers \
and translators can use the familiar Gettext tools and workflows."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5I18n5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "b92b3ac327011bedf075c7d1779593149b5d2c29cbc5529aac9c404af783ac3aa57c71e659789f5295441e9bc15a8634572982294e57df3f24bf6867b23a463b"

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
