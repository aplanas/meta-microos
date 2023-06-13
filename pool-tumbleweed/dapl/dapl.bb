SUMMARY = "A Library for userspace access to RDMA devices using OS Agnostic DAT APIs"
DESCRIPTION = "Along with the OpenFabrics kernel drivers, libdat and libdapl provide \
a userspace RDMA API that supports DAT 2.0 specification and IB \
transport extensions for atomic operations and rdma write with \
immediate data."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later | CPL-1.0"

PV = "2.1.10"

RPM_NAME = "dapl-2.1.10-5.1.aarch64.rpm"
RPM_HASH = "74915ad7c43c522bd58528e3c03778c647f262b61d30779591e2cb7ed3beb3fe4e00f05a595f70d1174ee6666548840c2790a05831b79a23322da3a1ff4ee900"

RPROVIDES:${PN} += "config(dapl) \
dapl \
dapl(aarch-64) \
libdaplofa.so.2()(64bit) \
libdaplofa.so.2(DAPL_CMA_2.0)(64bit) \
libdaploscm.so.2()(64bit) \
libdaploscm.so.2(DAPL_SCM_2.0)(64bit) \
libdaploucm.so.2()(64bit) \
libdaploucm.so.2(DAPL_OCM_2.0)(64bit)"

RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
coreutils \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libibverbs.so.1()(64bit) \
libibverbs.so.1(IBVERBS_1.0)(64bit) \
libibverbs.so.1(IBVERBS_1.1)(64bit) \
librdmacm.so.1()(64bit) \
librdmacm.so.1(RDMACM_1.0)(64bit) \
sed"

inherit rpm
