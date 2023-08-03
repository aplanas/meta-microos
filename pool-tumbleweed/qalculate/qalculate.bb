SUMMARY = "Multi-purpose desktop calculator application"
DESCRIPTION = "Qalculate is a multi-purpose desktop calculator. Features include \
customizable functions, units, arbitrary precision, plotting, and a \
graphical interface that uses a one-line fault-tolerant expression \
entry (although it supports optional traditional buttons). \
This is the commandline interface, named qalc."
LICENSE = "GPL-2.0-or-later"

PV = "4.7.0"

RPM_NAME = "qalculate-4.7.0-1.1.aarch64.rpm"
RPM_HASH = "6ec8092d7bc6fb08bd75ae4b8f0851cb202b229c9d3493d3c61c8396dc130dcdfc0f009aba565e319887667bcbad269612f3d088bd6d8ecfb7d56cfbb048fed3"

RPROVIDES:${PN} += "qalculate"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libqalculate.so.22 \
libreadline.so.8 \
libstdc++.so.6 \
qalculate-data"

inherit rpm
