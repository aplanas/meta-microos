SUMMARY = "Graphical user interface to launch Solarus games"
DESCRIPTION = "This package provides a graphical user interface to launch games \
based on the Solarus engine."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.5"

RPM_NAME = "solarus-gui-1.6.5-2.15.aarch64.rpm"
RPM_HASH = "6c5c5491ac96ab8414300f1a822a9f51df82d4f9a3b02fe405d4f4e6c911fc57cb825f43110c1ceef9319d7b8e2fe836710039720ad11827e0c4de2857891002"

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
