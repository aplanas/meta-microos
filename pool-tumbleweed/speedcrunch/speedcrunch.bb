SUMMARY = "Calculator with history display, keyboard-oriented"
DESCRIPTION = "A keyboard-oriented desktop scientific calculator which shows results in a \
scrollable display."
LICENSE = "GPL-2.0-or-later"

PV = "0.12"

RPM_NAME = "speedcrunch-0.12-2.1.aarch64.rpm"
RPM_HASH = "f7fa4b548f3fb64cf010fde9e30ac323476b97409b98a6f40f25e027df75f2e35abfc22541d74dcfa0bbc4ba4558bd411298e43c1f394df3467e6e4ecd9bad75"

RPROVIDES:${PN} += "speedcrunch"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Help.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
