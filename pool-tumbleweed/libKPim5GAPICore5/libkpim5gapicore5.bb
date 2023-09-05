SUMMARY = "Extension for accessing Google data"
DESCRIPTION = "An extension for accessing some Google services, such as Google Calendar, \
Google Contacts and Google tasks."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libKPim5GAPICore5-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "405c0290896b35bebb72ad15649c2b1e6986e114887c65d8f619160a8d83b8e518daacbeb6d037c3d4b5b44c87cd30ddd34962838bf91966dead1b1a1d0c6fd8"

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
