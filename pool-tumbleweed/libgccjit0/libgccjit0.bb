SUMMARY = "The GNU Compiler Collection JIT library"
DESCRIPTION = "Support for embedding GCC inside programs and libraries"
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7552"

RPM_NAME = "libgccjit0-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "72f44241d7d21320bc5dbe868d957105b3a963dbee9f3721457f36afd84daba2d3194712344092f1c7ab8344b208d572215f4d16cd6d5dc644ca520894f73d79"

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
