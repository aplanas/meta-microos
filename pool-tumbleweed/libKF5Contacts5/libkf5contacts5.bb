SUMMARY = "KDE Frameworks based address book API"
DESCRIPTION = "kcontacts is a Qt5 based library which provides an API \
to access address book data stored in different formats."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5Contacts5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "c83441de6216c255e3bf5940429f41c3a376f8a682222128298f6dcccf6354c0a29e1ff2c02b246d67433a37ca7dbf5ef5a8c37eaa9420f71d4f1a891350b780"

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
