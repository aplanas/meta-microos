SUMMARY = "LeechCraft Window Manager Module"
DESCRIPTION = "This package provides a WM control plugin for Leechcraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-fenet-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "b0dbca41ffe1c9837afef41c30cbf82e151674dc34857e9adf3107c6df9da846a8477e7dcf1415655513549fbe89e7abf63d1d37cbc4fc92746124c07486895c"

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
