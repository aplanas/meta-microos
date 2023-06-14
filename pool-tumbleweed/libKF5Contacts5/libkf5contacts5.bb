SUMMARY = "KDE Frameworks based address book API"
DESCRIPTION = "kcontacts is a Qt5 based library which provides an API \
to access address book data stored in different formats."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5Contacts5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "a8554c1ce61b6265752253f84a776015f74cea8de7358db909bd9f0192f75578a48f76c475a7cb66ec6c2ebeb1db3c4178acf4ad8e1e49a7f1e2b82445442860"

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
