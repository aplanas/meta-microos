SUMMARY = "Program to play the board game Blokus"
DESCRIPTION = "Pentobi is a computer opponent for the board game Blokus with \
support for Classic, Duo, Junior, Trigon, and Nexos game variants. \
Different levels of playing strength are available. Pentobi can \
save and load games along with comments and move variations."
LICENSE = "GPL-3.0-only"

PV = "23.1"

RPM_NAME = "pentobi-23.1-1.1.aarch64.rpm"
RPM_HASH = "7378364f1c6a2553ecabe16a220efd65a0b99c8cb554e4f9da0602b61e58c8ed4e950046271262d1de779acc8bc50419b8999464d1ecb8e8f4b19ff9f1f01a26"

RPROVIDES:${PN} += "pentobi"

RDEPENDS:${PN} += "hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickControls2.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
update-desktop-files"

inherit rpm
