SUMMARY = "The GNU Compiler Collection JIT library"
DESCRIPTION = "Support for embedding GCC inside programs and libraries"
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "libgccjit0-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "da5e76a2aaaa040601a4a1cbf9c8e74da27cc7efbecd1f3e293abe3b7da7aa764e2d13c2b58a882a32d7ce0554e83232f8acaa466d547ff1920157f1eed0e612"

RPROVIDES:${PN} += "libgccjit.so.0 \
libgccjit0"

RDEPENDS:${PN} += "/sbin/ldconfig \
gcc13 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
