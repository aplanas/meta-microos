SUMMARY = "LeechCraft MtpSync Module"
DESCRIPTION = "This package allows to synchronize with MTP devices via LeechCraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-lmp-mtpsync-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "1a58765ab0aa885ea8fd9b559ed80fd3e4f1afdbaa40b632a0543fe8f8c19192a39ba04e4d8ec9435c9d49c1699ad4870b61e9c841fb36ec660a69e4c20ec733"

RPROVIDES:${PN} += "leechcraft-lmp-mtpsync \
libleechcraft-lmp-mtpsync.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-devmon \
leechcraft-lmp \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libmtp.so.9 \
libstdc++.so.6"

inherit rpm
