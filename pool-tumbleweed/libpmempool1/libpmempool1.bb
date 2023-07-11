SUMMARY = "Persistent Memory pool management library"
DESCRIPTION = "The libpmempool library provides a set of utilities for off-line administration, \
analysis, diagnostics and repair of persistent memory pools created \
by libpmemlog, libpemblk and libpmemobj libraries."
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "libpmempool1-1.11.1-1.9.aarch64.rpm"
RPM_HASH = "6002991e1f822fcd413f86dd44679607ce88db169205f38c0212e04a7e6a077a4c69c1cc3bf71cd6a144d72ae1ebbefc16d3f970608c2fc217a9a64683d70f42"

RPROVIDES:${PN} += "libpmempool.so.1 \
libpmempool1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdaxctl.so.1 \
libndctl.so.6 \
libpmem.so.1"

inherit rpm
