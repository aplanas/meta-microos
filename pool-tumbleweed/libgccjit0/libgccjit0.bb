SUMMARY = "The GNU Compiler Collection JIT library"
DESCRIPTION = "Support for embedding GCC inside programs and libraries"
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7597"

RPM_NAME = "libgccjit0-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "be2e9c78ca277a68af3f87c6643314ad00c6479f8164aae9f40d01cb4ead8add54ce887c275da960f349f113cecae651c3a5310be51243393070157f960ed8a1"

RPROVIDES:${PN} += "libgccjit.so.0 \
libgccjit0"

RDEPENDS:${PN} += "/sbin/ldconfig \
gcc13 \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
