SUMMARY = "Remote Persistent Memory Access"
DESCRIPTION = "librpma is a C library for accessing persistent memory (PMem) devices on \
remote hosts over Remote Direct Memory Access (RDMA). \
 \
The librpma library provides two possible schemes of operation: \
Remote Memory Access and Messaging. Both of them are available over a connection \
established between two peers. Both of these schemes can make use of PMem as \
well as DRAM for the sake of building \
Remote Persistent Memory Accessing (RPMA) applications."
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "librpma0-1.2.0-1.2.aarch64.rpm"
RPM_HASH = "6772125b7a2875e779fe8e8dd7cdad21de6e732beab6bc9d57b4837531db8ae3bf6bb8eadd5779fcce95ebe2ad1c5aed1ff004d99674304c17e07adbb8f433a9"

RPROVIDES:${PN} += "librpma.so.0 \
librpma0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibverbs.so.1 \
librdmacm.so.1"

inherit rpm
