SUMMARY = "Flexible I/O tester"
DESCRIPTION = "fio is an I/O tool meant to be used both for benchmark and stress/hardware \
verification. It has support for 4 different types of I/O engines (sync, \
mmap, libaio, posixaio), I/O priorities (for newer Linux kernels), rate I/O, \
forked or threaded jobs, and much more. It can work on block devices as \
well as files. fio accepts job descriptions in a simple-to-understand text \
format. Several example job files are included. fio displays all sorts of \
I/O performance information, such as completion and submission latencies \
(avg/mean/deviation), bandwidth stats, cpu and disk utilization, and more."
LICENSE = "GPL-2.0-only"

PV = "3.35"

RPM_NAME = "fio-3.35-1.1.aarch64.rpm"
RPM_HASH = "efcb8f8a18c64af8557e53adb19bc732583bf3e5be46157f5f32b6347d98306599af4befb83e9a697b99868ec25b24108015f3b581e81583bc781f589a744bd1"

RPROVIDES:${PN} += "fio"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libaio.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libgfapi.so.0 \
libibverbs.so.1 \
libiscsi.so.9 \
libm.so.6 \
libnbd.so.0 \
libnuma.so.1 \
librados.so.2 \
librbd.so.1 \
librdmacm.so.1 \
libz.so.1"

inherit rpm
