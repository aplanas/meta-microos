SUMMARY = "Multi-purpose desktop calculator application"
DESCRIPTION = "Qalculate is a multi-purpose desktop calculator. Features include \
customizable functions, units, arbitrary precision, plotting, and a \
graphical interface that uses a one-line fault-tolerant expression \
entry (although it supports optional traditional buttons). \
This is the commandline interface, named qalc."
LICENSE = "GPL-2.0-or-later"

PV = "4.8.0"

RPM_NAME = "qalculate-4.8.0-1.1.aarch64.rpm"
RPM_HASH = "7ae04c6a24b5dce4d258bb65c74c22fb5183d35d8ec1ec049bc09fc199f378daf37f8726d4c22a3a825c12bba32732a41ab8c7049231e5cb94255a18dbc9e42e"

RPROVIDES:${PN} += "qalculate"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libqalculate.so.22 \
libreadline.so.8 \
libstdc++.so.6 \
qalculate-data"

inherit rpm
