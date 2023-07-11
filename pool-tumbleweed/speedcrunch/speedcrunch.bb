SUMMARY = "Calculator with history display, keyboard-oriented"
DESCRIPTION = "A keyboard-oriented desktop scientific calculator which shows results in a \
scrollable display."
LICENSE = "GPL-2.0+"

PV = "0.12"

RPM_NAME = "speedcrunch-0.12-1.33.aarch64.rpm"
RPM_HASH = "b42917c733293901feb22b985dc70004fdf6148f1bd1566ea8c44bfa420408fae14ae9407b89cb0e58e33a211691bfd09045596023b89fe6934eebf13259de4f"

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
