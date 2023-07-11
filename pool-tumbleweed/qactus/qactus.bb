SUMMARY = "A GUI client for OBS"
DESCRIPTION = "A Qt-based Open Build Service (OBS) client featuring a browser, request \
management and more."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "2.1.0"

RPM_NAME = "qactus-2.1.0-2.10.aarch64.rpm"
RPM_HASH = "1eb56dce4a7a1902e3f9eb0e179124299177c7717d5fbabaf34571f57dd6c6e9163a86d67b8fe1c5d6a725c91639110b36685489bd64568e760081372d94d376"

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
