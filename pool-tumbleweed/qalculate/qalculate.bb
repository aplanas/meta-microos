SUMMARY = "Multi-purpose desktop calculator application"
DESCRIPTION = "Qalculate is a multi-purpose desktop calculator. Features include \
customizable functions, units, arbitrary precision, plotting, and a \
graphical interface that uses a one-line fault-tolerant expression \
entry (although it supports optional traditional buttons). \
This is the commandline interface, named qalc."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1"

RPM_NAME = "qalculate-4.6.1-1.2.aarch64.rpm"
RPM_HASH = "6ce4810f3a94ee557dcd99bdf36684120c24e416dcee054563e493a5540ebd367b045e69792681948c3cc1148702b7d218dd93b35a520953c20e5da8bc44aea6"

RPROVIDES:${PN} += "qalculate"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libqalculate.so.22 \
libreadline.so.8 \
libstdc++.so.6 \
qalculate-data"

inherit rpm
