SUMMARY = "The GNU Compiler Collection JIT library"
DESCRIPTION = "Support for embedding GCC inside programs and libraries"
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "libgccjit0-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "5fb44db6d42f6ca8e82147d2e3a350db4c10d6891395267044e78d3017e9169862e26c5557c36153fe556f9956e9d86f1481b634e46f690d5dfc0740c256e66a"

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
