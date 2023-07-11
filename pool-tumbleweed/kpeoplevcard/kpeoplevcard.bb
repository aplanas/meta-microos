SUMMARY = "A vCard plugin for KPeople"
DESCRIPTION = "Kpeoplevcard provides a datasource plugin for KPeople that reads vCard files \
from the local filesystem."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1"

RPM_NAME = "kpeoplevcard-0.1-1.16.aarch64.rpm"
RPM_HASH = "9de6031ff786adf7dd1d9958583e62d6deb2697895e2b1d7d5f88146f994a032fc1e30591a3fe6fcdc74731d20e580db17a108a41bcc538db4be802fc71ce83d"

RPROVIDES:${PN} += "kpeoplevcard"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Contacts.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5PeopleBackend.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
