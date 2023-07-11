SUMMARY = "LeechCraft Tab Session Manager Module"
DESCRIPTION = "This package provides a Tab Session Manager plugin for Leechcraft \
which allows to automatically restore the last session and allows \
to create named sessions."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-tabsessionmanager-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "1ccd9922f1f43e924744104b560b74ffe37163ef86b0ff0d108113dce9778cab2df8dd44ba8e795167766b0ac9a5ba7492cb81708802cc068b5a22eda8686fd0"

RPROVIDES:${PN} += "leechcraft-tabsessionmanager \
libleechcraft-tabsessmanager.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sll-qt5.so.0.6.75.1 \
libstdc++.so.6"

inherit rpm
