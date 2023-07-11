SUMMARY = "LeechCraft Azoth Ignore Module"
DESCRIPTION = "This package provides a plugin for LeechCraft Azoth to ignore \
unwanted participants."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-depester-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "5cf64559d42475e93e841843d795dfc1b3080f1d1c2b9e883f8f98e1e61428ab59401520e0f9cccc1b4fad114a924d00c4af5f68e2417632e7128f7a8cfbcbeb"

RPROVIDES:${PN} += "leechcraft-azoth-depester \
libleechcraft-azoth-depester.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libstdc++.so.6"

inherit rpm
