SUMMARY = "Program to play the board game Blokus"
DESCRIPTION = "Pentobi is a computer opponent for the board game Blokus with \
support for Classic, Duo, Junior, Trigon, and Nexos game variants. \
Different levels of playing strength are available. Pentobi can \
save and load games along with comments and move variations."
LICENSE = "GPL-3.0-only"

PV = "23.0"

RPM_NAME = "pentobi-23.0-1.3.aarch64.rpm"
RPM_HASH = "5858b3dc4b1d42ceec124d313ff1d942f7ffe96b6f7013272abc4c55317441ecf218f9fb659ce14efc34e8807e9ea00d6b1bf80345bd8d68675f416398c48d0a"

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
