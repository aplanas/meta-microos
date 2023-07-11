SUMMARY = "KDE Gettext-based UI text internationalization"
DESCRIPTION = "KI18n provides functionality for internationalizing user interface text \
in applications, based on the GNU Gettext translation system. \
It wraps the standard Gettext functionality, so that the programmers \
and translators can use the familiar Gettext tools and workflows."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5I18n5-5.107.0-1.3.aarch64.rpm"
RPM_HASH = "5ff281bb6b393ff38df2f2d3c78e536049dc1231c81bc8b61974a5f86886eabbcdb23c4a054d79d502e550d0fb86211b0bb5d4e7a50239964ca1e3fff68457a2"

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
