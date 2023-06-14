SUMMARY = "LeechCraft Azoth Module for automatic status change"
DESCRIPTION = "This package provides a LeechCraft Azoth plugin which can \
automatically change your status based on an inactivity period."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-autoidler-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "d3be8946519b6ed124eb88d669f53a9812b0ecdd5175ff5fb569d33ff11d17da9fddbd5cbbf2235125be017901a8790d281a77aed668d56a7a5a8a4bc5dad02b"

RPROVIDES:${PN} += "leechcraft-azoth-autoidler \
libleechcraft-azoth-autoidler.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libXss.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
