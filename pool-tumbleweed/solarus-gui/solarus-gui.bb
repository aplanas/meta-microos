SUMMARY = "Graphical user interface to launch Solarus games"
DESCRIPTION = "This package provides a graphical user interface to launch games \
based on the Solarus engine."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.5"

RPM_NAME = "solarus-gui-1.6.5-2.16.aarch64.rpm"
RPM_HASH = "dc2109f6cd04795a1c6ca61095430adbf65cd60f358d89cf78b170ae0ccaa1203b317126e8a33c6ed7a4e1831d473f700607f86315634ec91edbbdce9527235e"

RPROVIDES:${PN} += "solarus-gui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libsolarus-gui.so.1 \
libsolarus.so.1 \
libstdc++.so.6"

inherit rpm
