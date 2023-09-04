SUMMARY = "Framework for integration of KDE frameworks widgets with Qt Designer"
DESCRIPTION = "This framework provides plugins for Qt Designer that allow it to display \
the widgets provided by various KDE frameworks, as well as a utility \
(kgendesignerplugin) that can be used to generate other such plugins \
from ini-style description files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kdesignerplugin-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "903a64aa606530cb2a56b2fd66ac485e6c2612e7446fe60673df7fc426ebd7a533482acd44f39b14581ad42a7fe8d16a9ff00ce3ec38d1e523e0131827c73696"

RPROVIDES:${PN} += "kdesignerplugin"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
