SUMMARY = "LeechCraft History Module"
DESCRIPTION = "This package provides a history keeper plugin for LeechCraft \
which stores information about finished downloads and similar events, \
and allows to search it by text, wildcard, regular expressions or tags."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-historyholder-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "ea39e049b2a07dee99de8527a306c07b7e345f02622e63718e688b30b67c1fb01fea8cc5c20116eb23f29a45d3d482c0ffc47b7e370b4764a51921c3cafad197"

RPROVIDES:${PN} += "leechcraft-historyholder \
libleechcraft-historyholder.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt5Core.so.5 \
libQt5Sql.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-db-qt5.so.0.6.75.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libleechcraft-util-tags-qt5.so.0.6.75.1 \
libstdc++.so.6"

inherit rpm
