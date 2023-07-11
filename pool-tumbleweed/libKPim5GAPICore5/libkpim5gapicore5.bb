SUMMARY = "Extension for accessing Google data"
DESCRIPTION = "An extension for accessing some Google services, such as Google Calendar, \
Google Contacts and Google tasks."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libKPim5GAPICore5-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "4f532f67c16f1b980108ebc12b7c633d46eaba1e24e562c478b2228db0d36db83112afbe2a0cdf67f5c9af695a7b3b0f947d33498eaef8b596d8286c70df2552"

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
