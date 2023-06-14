SUMMARY = "System utility library for LeechCraft"
DESCRIPTION = "A library providing some commonly used system-related \
classes and functions, like OS version parser, paths utilities or MIME \
detector."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "libleechcraft-util-sys-qt5-0_6_75_1-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "4c0b2e962627ebdb8d72a434d310f685a16fe8d9ef487432cf429e056b2bb21c6edaa80ad06036f5559cae61b136a180ed6d33d74b202ad12ddeca30b4859f60"

RPROVIDES:${PN} += "libleechcraft-util-sys-qt5-0-6-75-1 \
libleechcraft-util-sys-qt5.so.0.6.75.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
