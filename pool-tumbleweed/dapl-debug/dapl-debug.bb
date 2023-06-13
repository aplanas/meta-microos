SUMMARY = "A Library for userspace access to RDMA devices using OS Agnostic DAT APIs"
DESCRIPTION = "Along with the OpenFabrics kernel drivers, libdat and libdapl provide \
a userspace RDMA API that supports DAT 2.0 specification and IB \
transport extensions for atomic operations and rdma write with \
immediate data."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later | CPL-1.0"

PV = "2.1.10"

RPM_NAME = "dapl-debug-2.1.10-5.1.aarch64.rpm"
RPM_HASH = "c0e07d81f362472d2e22d19e5204a5d21fca81791469f5bb90d5e322adfa795df72897934675bac6e4ca2ffb3107b196ab2385ff3bdf796cb518c0953c28d423"

RPROVIDES:${PN} += "config(dapl-debug) \
dapl-debug \
dapl-debug(aarch-64) \
libdaplofa.so.2()(64bit) \
libdaploscm.so.2()(64bit) \
libdaploucm.so.2()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
coreutils \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libibverbs.so.1()(64bit) \
librdmacm.so.1()(64bit) \
sed"

inherit rpm
