SUMMARY = "A MySQL benchmarking tool"
DESCRIPTION = "This benchmark was designed for identifying basic system parameters, as \
they are important for systems using MySQL (w Innodb) under intensive \
load."
LICENSE = "GPL-2.0-only"

PV = "1.0.20"

RPM_NAME = "sysbench-1.0.20-1.17.aarch64.rpm"
RPM_HASH = "44762bf74dae01dcb10be02ad43710d7ed1d4506fdf0b83dd6a2041671e26a7ae0d73a6b9844bc6d835b67d6b9e8821b72e1dab11c3ee392be6e8927efe5c326"

RPROVIDES:${PN} += "sysbench"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libaio.so.1 \
libc.so.6 \
libluajit-5.1.so.2 \
libm.so.6 \
libmariadb.so.3 \
libpq.so.5"

inherit rpm
