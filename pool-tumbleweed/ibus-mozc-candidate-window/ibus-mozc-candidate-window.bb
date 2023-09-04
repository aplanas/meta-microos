SUMMARY = "An optional candidate window for ibus-mozc"
DESCRIPTION = "This package provides an advanced candidate window for IBus. The \
window shows examples of selected words."
LICENSE = "Apache-2.0 & BSD-3-Clause & SUSE-Public-Domain"

PV = "2.29.5111.102"

RPM_NAME = "ibus-mozc-candidate-window-2.29.5111.102-2.1.aarch64.rpm"
RPM_HASH = "c85ff579e28e96348084524a7488899361771eab0d88b377b4a2bc05b8b94e9b87554444a7d3fe7b51f0d06ceabea85c895f6b0be568db4d041d042f63a6ad14"

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
