SUMMARY = "A vCard plugin for KPeople"
DESCRIPTION = "Kpeoplevcard provides a datasource plugin for KPeople that reads vCard files \
from the local filesystem."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1"

RPM_NAME = "kpeoplevcard-0.1-1.15.aarch64.rpm"
RPM_HASH = "6ee983bf6ed8fb5493f416bf3d2fc275dcbfc67389097828159be14815661462a20572b15eff9e0e04aaa0f99039b0cdaf2253e930cc57aa5bfe32038b1ce703"

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
