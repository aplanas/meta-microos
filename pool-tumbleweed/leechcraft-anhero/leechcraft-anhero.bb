SUMMARY = "LeechCraft Crash handler Module"
DESCRIPTION = "This package provides a crash handler plugin for LeechCraft \
which shows backtraces and aids in sending bug reports."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-anhero-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "17be662c1fdd89c97cc714c97da7bb5c483bab9eb2b2e8c94874bcdcc9884dccf72de756216ef9238e0040506a0b58d195d233bf9d040f26f3c09edc760c3438"

RPROVIDES:${PN} += "leechcraft-anhero \
libleechcraft-anhero.so"

RDEPENDS:${PN} += "gdb \
ld-linux-aarch64.so.1 \
leechcraft \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libboost-program-options.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libstdc++.so.6"

inherit rpm
