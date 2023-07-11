SUMMARY = "KDE Frameworks based address book API"
DESCRIPTION = "kcontacts is a Qt5 based library which provides an API \
to access address book data stored in different formats."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5Contacts5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "f149b360bedae7e88df08c9a5fe0ad52af5e4976428a978fa77cb18d8182cc980f0df88d7a24e4a6f558d1a93d33a8a2c89d8f69bd2f70a2442fcd2550cbe2c1"

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
