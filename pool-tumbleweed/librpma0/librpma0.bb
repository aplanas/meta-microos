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

RPM_NAME = "librpma0-1.2.0-1.1.aarch64.rpm"
RPM_HASH = "9421f5e2ab1a3ee44bf80977b6e2c89af1dcf896b09361043be843b276d884e2778897f65b8e776037f3d99d5893ffab1b3edc20fbe3e2176a56b67f837ea189"

RPROVIDES:${PN} += "librpma.so.0()(64bit) \
librpma0 \
librpma0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libibverbs.so.1()(64bit) \
librdmacm.so.1()(64bit)"

inherit rpm
