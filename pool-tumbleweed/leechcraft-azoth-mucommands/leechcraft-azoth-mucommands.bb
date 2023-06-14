SUMMARY = "LeechCraft Azoth module for conference-oriented commands"
DESCRIPTION = "This package provides some common conference-oriented commands like \
/vcard, /time, /last, /subject, /kick, /ban and so on for LeechCraft Azoth."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-mucommands-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "24e209ef019ab6bd210edc2fe247965d0f08b47f33e0bba4a6ab0d8a7e8b2f4e582ad5fa993fcf24e54950589a6a14a645a138f23166e089b0550d5df95a42a1"

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
