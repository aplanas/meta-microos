SUMMARY = "Extension for accessing Google data"
DESCRIPTION = "An extension for accessing some Google services, such as Google Calendar, \
Google Contacts and Google tasks."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5GAPIMaps5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "f9fea4094838b2562052b541613d12aac3f3b939d1e3d5a5286fcdc50110bb983413f0246cb9f350b620e0b50b08fe48b3a9064d45af0fe8b641edfabbad7b3c"

RPROVIDES:${PN} += "libKPim5GAPIMaps.so.5 \
libKPim5GAPIMaps5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Contacts.so.5 \
libKPim5GAPICore.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
