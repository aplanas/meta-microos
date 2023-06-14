SUMMARY = "Extension for accessing Google data"
DESCRIPTION = "An extension for accessing some Google services, such as Google Calendar, \
Google Contacts and Google tasks."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5GAPIDrive5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "29e2b3bddfc9f85052f73b7e557f0d54900cad7585166fbd6b2f62ac54302495e60465175776edf698c7b67cdf46684303267c8444a3b78977b7dac117fc55fe"

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
