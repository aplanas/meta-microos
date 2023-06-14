SUMMARY = "LeechCraft Azoth module for 'Last Seen' functionality"
DESCRIPTION = "This package provides a plugin for LeechCraft Azoth which records \
contacts' last online and availability time on the client side. It \
does not depend on a concrete protocol implementation."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-lastseen-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "5bf1bdc71d24906a789c8c662ab8e0f2fdb6ad23af3e60fd298471a452679c3d6109b3250df5695ec3a632617018a539b68a69e6875ee3ecb48810d00ceffa05"

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
