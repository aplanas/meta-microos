SUMMARY = "KDE Frameworks based address book API"
DESCRIPTION = "kcontacts is a Qt5 based library which provides an API \
to access address book data stored in different formats."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5Contacts5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "59c62cc33a2532dd0f3d2843163f39c97cb03d4c6b4a7b1547f1c0c290d04c0670c1acfa1c0a443ff0a72a90665685477c4cf43045b1b787f314fb309a92c94c"

RPROVIDES:${PN} += "kcontacts \
kcontacts-data \
libKF5Contacts.so.5 \
libKF5Contacts5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Codecs.so.5 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5I18nLocaleData.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
