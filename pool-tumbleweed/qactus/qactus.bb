SUMMARY = "A GUI client for OBS"
DESCRIPTION = "A Qt-based Open Build Service (OBS) client featuring a browser, request \
management and more."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "2.1.0"

RPM_NAME = "qactus-2.1.0-2.9.aarch64.rpm"
RPM_HASH = "6c411334590134931a94adefe375b3a138086bf58b1b39ac86fa796304dcec516bab4df86ba4e9a2b4fc3c4709a2f842633448e490e8e30e41d7b74ce511b412"

RPROVIDES:${PN} += "qactus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libqobs.so.2 \
libqobs2 \
libqt5keychain.so.1 \
libstdc++.so.6"

inherit rpm
