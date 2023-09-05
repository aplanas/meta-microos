SUMMARY = "Extension for accessing Google data"
DESCRIPTION = "An extension for accessing some Google services, such as Google Calendar, \
Google Contacts and Google tasks."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libKPim5GAPIDrive5-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "fb3a3e205488eb7274f2f69e414653f0f10d5909746c57a6ff6535651c1b83697f5eccdef1253b5d6696752cc5b8ac915cbfcc776b96dabe904e6c162c3e270d"

RPROVIDES:${PN} += "libKPim5GAPIDrive.so.5 \
libKPim5GAPIDrive5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKPim5GAPICore.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
