SUMMARY = "LeechCraft Azoth Antispam Module"
DESCRIPTION = "This package provides a basic antispam plugin for LeechCraft Azoth."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-herbicide-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "228834a89cd6fc92c836fd913b4464af903706a3e2f3edceb3086053b2fa465a790a0d5891e1ef02fbfc789e73967f5142102c2da84c8e27d9c0926cf145548b"

RPROVIDES:${PN} += "leechcraft-azoth-herbicide \
libleechcraft-azoth-herbicide.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-db-qt5.so.0.6.75.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sll-qt5.so.0.6.75.1 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
