SUMMARY = "Extension for accessing Google data"
DESCRIPTION = "An extension for accessing some Google services, such as Google Calendar, \
Google Contacts and Google tasks."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libKPim5GAPIDrive5-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "8fcf83e140b3ea4aa6898ef396b3e31401bdfbb729cd68a27681859911d6c5d77c6aebe6388aadaa6a5f576c9c905d0abd483342a22f1131a08ff60590b201c7"

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
