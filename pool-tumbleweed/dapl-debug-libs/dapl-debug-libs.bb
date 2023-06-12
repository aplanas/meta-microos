SUMMARY = "DAPL runtime libraries"
DESCRIPTION = "libdat and libdapl provide a userspace RDMA API that supports DAT 2.0 \
specification and IB transport extensions for atomic operations and \
rdma write with immediate data. \
 \
This package contains the runtime libraries. \
 \
The libraries have tracing enabled."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later | CPL-1.0"

PV = "2.1.10"

RPM_NAME = "dapl-debug-libs-2.1.10-5.1.aarch64.rpm"
RPM_HASH = "d07bdf27b4a442219e60a70616b582e1d190b03f6253f17e52beac34c59bf999f4d2b53aa63f2bef64447272e9bdca06cd7cd91531517d6f1625140a7eea962f"

RPROVIDES:${PN} += "dapl-debug-libs \
dapl-debug-libs(aarch-64) \
dapl2 \
libdat2.so.2()(64bit) \
libdat2.so.2(DAT_2.0)(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
dapl-debug \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
