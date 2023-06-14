SUMMARY = "LeechCraft Current user tune Module"
DESCRIPTION = "This package provides a tune wrapper plugin for LeechCraft \
with which you can get the current user tune via mpris protocol."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-xtazy-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "058a7c99970ce4c30d3708c844bcd7024d9d00f9c8b28a4f27a735b4cc06b376d92bcf288d64050888ae730f69163fe1a1d66a833f7d2af6cc62116e53af573a"

RPROVIDES:${PN} += "leechcraft-xtazy \
libleechcraft-xtazy.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
