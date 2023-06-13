SUMMARY = "A MySQL benchmarking tool"
DESCRIPTION = "This benchmark was designed for identifying basic system parameters, as \
they are important for systems using MySQL (w Innodb) under intensive \
load."
LICENSE = "GPL-2.0-only"

PV = "1.0.20"

RPM_NAME = "sysbench-1.0.20-1.16.aarch64.rpm"
RPM_HASH = "beea854feef6eac4c0bd9c4bc9fa05db17ae1edb390b01c04de939c5a2078cfc8fc919b48042c9bdca4b9488d0991ba8973e4df8b46e5f328b4ad1b384c379c2"

RPROVIDES:${PN} += "sysbench \
sysbench(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libaio.so.1()(64bit) \
libaio.so.1(LIBAIO_0.1)(64bit) \
libaio.so.1(LIBAIO_0.4)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libluajit-5.1.so.2()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmariadb.so.3()(64bit) \
libmariadb.so.3(libmysqlclient_18)(64bit) \
libpq.so.5()(64bit)"

inherit rpm
