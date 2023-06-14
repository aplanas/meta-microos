SUMMARY = "System tray that downloads and display info about the Turris router"
DESCRIPTION = "Spectator, systray tool to display various informations about the \
Turris router from CZ.nic"
LICENSE = "GPL-3.0+"

PV = "0.6+git74.9ef0de5"

RPM_NAME = "spectator-0.6+git74.9ef0de5-1.27.aarch64.rpm"
RPM_HASH = "6c84492adc9e3a4dd8089618e41a19ff986728341e2cbb0a430b83d5f7583c7d32f2ab2b4cbd7daaf3903f197cc2d37bd91d42323deb2999ec59c40cfe2a9816"

RPROVIDES:${PN} += "spectator"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libturris-spectator.so.0 \
openssl"

inherit rpm
