SUMMARY = "LeechCraft Azoth module for conference-oriented commands"
DESCRIPTION = "This package provides some common conference-oriented commands like \
/vcard, /time, /last, /subject, /kick, /ban and so on for LeechCraft Azoth."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-mucommands-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "c2cdbf64cf74fbfa6461353cc412c0760b15766918b3b822a542e5b3ce5cfca7c5e26328ef482fc3758ac066d6bcb963b3f0275496492f0e7f69779974c9d072"

RPROVIDES:${PN} += "leechcraft-azoth-mucommands \
libleechcraft-azoth-mucommands.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth-protocolplugin \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sll-qt5.so.0.6.75.1 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
