SUMMARY = "LeechCraft HTTP Server Module"
DESCRIPTION = "This package provides content from local filesystem over LANs. \
(Possibly also WANs, but, by default, only LAN interfaces are listened on)."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-htthare-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "62646385c4c83d51d5b377de6ee86bda9cd3a077ac8e761e34f8ffd6448fc3ede65e1a9876727017cf4302d8503dd153fb3c144222251d503876cf3eebad6d5f"

RPROVIDES:${PN} += "leechcraft-htthare \
libleechcraft-htthare.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libleechcraft-util-xsd-qt5.so.0.6.75 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
