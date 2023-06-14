SUMMARY = "LeechCraft HTTP Server Module"
DESCRIPTION = "This package provides content from local filesystem over LANs. \
(Possibly also WANs, but, by default, only LAN interfaces are listened on)."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-htthare-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "f4742bf54e30645d60c479797b29837718c7f1c610345f5a3dc4cdb561d0045333cd9446835a8b6da20e4e3ae009b2deb2d9dd761c14ad37f47e3e010f385bcc"

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
