SUMMARY = "Userspace RDMA Connection Manager"
DESCRIPTION = "librdmacm provides a userspace RDMA Communication Management API."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "45.0"

RPM_NAME = "librdmacm1-45.0-1.1.aarch64.rpm"
RPM_HASH = "c39518040f66bff23c81e12bd5a2fb9f7123ba8b697211ee58325c19d5dd41afb021d0468c103deff64d569482c9d78650288bb6cd81f6562145783fb313d3fa"

RPROVIDES:${PN} += "librdmacm \
librdmacm.so.1()(64bit) \
librdmacm.so.1(RDMACM_1.0)(64bit) \
librdmacm.so.1(RDMACM_1.1)(64bit) \
librdmacm.so.1(RDMACM_1.2)(64bit) \
librdmacm.so.1(RDMACM_1.3)(64bit) \
librdmacm1 \
librdmacm1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libibverbs.so.1()(64bit) \
libibverbs.so.1(IBVERBS_1.0)(64bit) \
libibverbs.so.1(IBVERBS_1.1)(64bit) \
libibverbs.so.1(IBVERBS_1.10)(64bit) \
libibverbs.so.1(IBVERBS_1.5)(64bit) \
libibverbs.so.1(IBVERBS_1.9)(64bit) \
libnl-3.so.200()(64bit) \
libnl-3.so.200(libnl_3)(64bit) \
rdma-core"

inherit rpm
