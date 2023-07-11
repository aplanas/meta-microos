SUMMARY = "LeechCraft Azoth module for 'Last Seen' functionality"
DESCRIPTION = "This package provides a plugin for LeechCraft Azoth which records \
contacts' last online and availability time on the client side. It \
does not depend on a concrete protocol implementation."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-lastseen-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "04615b2c2faa23bf58f64b5235bc9f52f794c05b10a1b7c2d6c0d58565c5dd0575ab027d37223bb3b668ff40a25cfe5c07e2c77b09a7fadd969696cb01fe8eee"

RPROVIDES:${PN} += "leechcraft-azoth-lastseen \
libleechcraft-azoth-lastseen.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth \
libQt5Core.so.5 \
libQt5Sql.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-db-qt5.so.0.6.75.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libstdc++.so.6"

inherit rpm
