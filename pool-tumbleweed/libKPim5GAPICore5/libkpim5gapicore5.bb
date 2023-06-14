SUMMARY = "Extension for accessing Google data"
DESCRIPTION = "An extension for accessing some Google services, such as Google Calendar, \
Google Contacts and Google tasks."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5GAPICore5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "c21bb4d8aa48a493a25dedc84fb2f1c4acfad2cddd2effe8f90b98d724b933d8110a92c59ba494825562a1f3f5a7e7b90eb30288c675ddba55e85597a9251d5c"

RPROVIDES:${PN} += "libKPim5GAPICore.so.5 \
libKPim5GAPICore5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Wallet.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libstdc++.so.6 \
sasl2-kdexoauth2"

inherit rpm
