SUMMARY = "PROXY-based filesystem backend for NFS-GANESHA"
DESCRIPTION = "This package contains a FSAL shared object to \
be used with NFS-Ganesha to support PROXY based filesystems"
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.3+git0.39e0cf712"

RPM_NAME = "nfs-ganesha-proxy-3.3+git0.39e0cf712-5.8.aarch64.rpm"
RPM_HASH = "685d09cb32980dad239f9d4f5086e40acba3a12eb3e530076ea5af47ca6c2a36d198513a532889c9fcc1859362463941a71c80bbc75f02fd391271a28e9321e0"

RPROVIDES:${PN} += "libfsalproxy.so()(64bit) \
nfs-ganesha-proxy \
nfs-ganesha-proxy(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libganesha_nfsd.so.3.3()(64bit) \
libntirpc.so.3.3()(64bit) \
libntirpc.so.3.3(NTIRPC_3.3)(64bit) \
liburcu-bp.so.8()(64bit) \
nfs-ganesha"

inherit rpm
