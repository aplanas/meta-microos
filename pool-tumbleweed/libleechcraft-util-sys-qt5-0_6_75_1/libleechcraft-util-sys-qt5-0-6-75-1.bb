SUMMARY = "System utility library for LeechCraft"
DESCRIPTION = "A library providing some commonly used system-related \
classes and functions, like OS version parser, paths utilities or MIME \
detector."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "libleechcraft-util-sys-qt5-0_6_75_1-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "9c6af6f6891c1c9abdd5ab04d4b9112ad5fa1a075fd0a2bca0cc824815a4c7b633f58c435f3fa171ba43108454780e7271d74e5709244957c6cd9eed9e146cc8"

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
