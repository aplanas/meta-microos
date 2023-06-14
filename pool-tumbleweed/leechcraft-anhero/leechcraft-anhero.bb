SUMMARY = "LeechCraft Crash handler Module"
DESCRIPTION = "This package provides a crash handler plugin for LeechCraft \
which shows backtraces and aids in sending bug reports."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-anhero-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "b026e1d28c458727e979f1c424943c26aa3262bc01bc07eeca46a3886f0481c80ee8bc7feae7887fca7794351077dce678c3f3bf37e8ef600b6784a61aca8c98"

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
