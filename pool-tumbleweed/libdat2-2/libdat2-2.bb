SUMMARY = "DAPL runtime libraries"
DESCRIPTION = "libdat and libdapl provide a userspace RDMA API that supports DAT 2.0 \
specification and IB transport extensions for atomic operations and \
rdma write with immediate data. \
 \
This package contains the runtime libraries."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later | CPL-1.0"

PV = "2.1.10"

RPM_NAME = "libdat2-2-2.1.10-5.2.aarch64.rpm"
RPM_HASH = "7484f57e6fa13766a341416283ea9b8ca4bc5838833744ee6d5529d45ae5be539c7a5424f48c051fa9d834a76286bb069691a2965431b3579a6a52f5b1fbffd4"

RPROVIDES:${PN} += "dapl2 \
libdat2-2 \
libdat2.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
dapl \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
