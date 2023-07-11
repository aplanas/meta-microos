SUMMARY = "Low-level persistent memory support library"
DESCRIPTION = "libpmem provides low level persistent memory support, in particular, \
support for the persistent memory instructions for flushing changes \
to pmem. libpmem2 has a new API that addresses many of the shortcommings \
of libpmem1"
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "libpmem2-1-1.11.1-1.9.aarch64.rpm"
RPM_HASH = "7eac5c6f8d87f8065c44196ee1bf9509465368b72651dbcfeed29b4160010d74fa7829b413b5fe7a1a236dca62957d7408fea776a0d39a625517588bcc7b89cc"

RPROVIDES:${PN} += "libpmem2-1 \
libpmem2.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdaxctl.so.1 \
libndctl.so.6"

inherit rpm
