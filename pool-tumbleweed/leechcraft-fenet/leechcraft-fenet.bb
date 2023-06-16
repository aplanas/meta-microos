SUMMARY = "LeechCraft Window Manager Module"
DESCRIPTION = "This package provides a WM control plugin for Leechcraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-fenet-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "90ff6a76fdd8c4926413ab6bb1c647bcfcce9125437a48c55094570264afb50472a5103a840e4b075ce174d749c790fdbdefbe7d69746a95c468de725b3ce406"

RPROVIDES:${PN} += "leechcraft-fenet \
leechcraft-fenet-compton \
libleechcraft-fenet.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-fenet-wm \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
