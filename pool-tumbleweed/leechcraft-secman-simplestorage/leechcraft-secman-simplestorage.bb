SUMMARY = "LeechCraft Simple storage Module"
DESCRIPTION = "This package provides a simple unencrypted storage backend for LeechCraft SecMan."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-secman-simplestorage-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "0a4b6ffb3c7212b708f6db1801c53de345e23b5cb57b938c60ae4c4aed3d2b6da59811d8557170e2fc982835720fae5dd0b2cd832fac965d0fe21539e881833d"

RPROVIDES:${PN} += "leechcraft-secman-simplestorage \
libleechcraft-secman-simplestorage.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-secman \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
