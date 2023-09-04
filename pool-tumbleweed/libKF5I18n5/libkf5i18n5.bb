SUMMARY = "KDE Gettext-based UI text internationalization"
DESCRIPTION = "KI18n provides functionality for internationalizing user interface text \
in applications, based on the GNU Gettext translation system. \
It wraps the standard Gettext functionality, so that the programmers \
and translators can use the familiar Gettext tools and workflows."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5I18n5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "02758cfa9555f7810cdd790867bff5f7e9546a158d6e872f97d19c6992e64c8c8fa454286715c144ec89409fec56001a62cb3b01567474b5f5ee1c4ae9315108"

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
