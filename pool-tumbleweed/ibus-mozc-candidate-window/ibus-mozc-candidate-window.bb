SUMMARY = "An optional candidate window for ibus-mozc"
DESCRIPTION = "This package provides an advanced candidate window for IBus. The \
window shows examples of selected words."
LICENSE = "Apache-2.0 & BSD-3-Clause & SUSE-Public-Domain"

PV = "2.29.5111.102"

RPM_NAME = "ibus-mozc-candidate-window-2.29.5111.102-1.1.aarch64.rpm"
RPM_HASH = "238101ba8f99310c6828cdd24fe087c4f3876c80b5f2c74a57e4d6ddb2cec2d6befd4bfd45cc4dc9028eb4e8595a836ba0457c2a3385f6dfcc1058b14bf42b62"

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
