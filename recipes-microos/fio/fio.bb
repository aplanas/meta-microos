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

PV = "3.34"

RPM_NAME = "fio-3.34-2.1.aarch64.rpm"
RPM_HASH = "334b87324959c3b8ac491243126afcc6fb58de802da6a5f1d9769fff1b60ddc6ec56b4b034f6ca81b9d0e0d076a7fc157b11522eca9d42b32f22129d0ed70cb4"

RPROVIDES:${PN} += "fio \
fio(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libaio.so.1()(64bit) \
libaio.so.1(LIBAIO_0.1)(64bit) \
libaio.so.1(LIBAIO_0.4)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libcurl.so.4()(64bit) \
libgfapi.so.0()(64bit) \
libgfapi.so.0(GFAPI_3.4.0)(64bit) \
libgfapi.so.0(GFAPI_6.0)(64bit) \
libibverbs.so.1()(64bit) \
libibverbs.so.1(IBVERBS_1.0)(64bit) \
libibverbs.so.1(IBVERBS_1.1)(64bit) \
libiscsi.so.9()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libnbd.so.0()(64bit) \
libnbd.so.0(LIBNBD_1.0)(64bit) \
libnuma.so.1()(64bit) \
libnuma.so.1(libnuma_1.1)(64bit) \
libnuma.so.1(libnuma_1.2)(64bit) \
librados.so.2()(64bit) \
librbd.so.1()(64bit) \
librdmacm.so.1()(64bit) \
librdmacm.so.1(RDMACM_1.0)(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.0)(64bit)"

inherit rpm
