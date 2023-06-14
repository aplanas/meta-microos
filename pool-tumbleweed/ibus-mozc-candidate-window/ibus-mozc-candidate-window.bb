SUMMARY = "An optional candidate window for ibus-mozc"
DESCRIPTION = "This package provides an advanced candidate window for IBus. The \
window shows examples of selected words."
LICENSE = "Apache-2.0 & BSD-3-Clause & SUSE-Public-Domain"

PV = "2.28.4715.102"

RPM_NAME = "ibus-mozc-candidate-window-2.28.4715.102-2.1.aarch64.rpm"
RPM_HASH = "9978326d45fb69380420e53e76bba9c0559da0bde027b0aac0b0d656f1ca0aa44a9b20b5205e1da0424952ed6e48af87651d4f53cb8da7545f1d8aed6006394f"

RPROVIDES:${PN} += "ibus-mozc-candidate-window \
locale-ibus-ja"

RDEPENDS:${PN} += "ibus-mozc \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
