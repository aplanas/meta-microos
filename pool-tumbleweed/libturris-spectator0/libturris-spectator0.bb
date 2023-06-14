SUMMARY = "System tray that downloads and display info about the Turris router"
DESCRIPTION = "Spectator, systray tool to display various informations about the \
Turris router from CZ.nic"
LICENSE = "GPL-3.0+"

PV = "0.6+git74.9ef0de5"

RPM_NAME = "libturris-spectator0-0.6+git74.9ef0de5-1.27.aarch64.rpm"
RPM_HASH = "57c432c2d7e65b19cff09b5ed1227fccc70fb771f5833fc33cc7a0d2b39d1d2a58142ca10743ddf3b5b70632027bd8989b7cd90de54550d369880bdb4fba7ecf"

RPROVIDES:${PN} += "libturris-spectator.so.0 \
libturris-spectator0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
