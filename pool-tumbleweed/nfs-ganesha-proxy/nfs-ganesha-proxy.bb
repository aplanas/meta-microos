SUMMARY = "PROXY-based filesystem backend for NFS-GANESHA"
DESCRIPTION = "This package contains a FSAL shared object to \
be used with NFS-Ganesha to support PROXY based filesystems"
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.3+git0.39e0cf712"

RPM_NAME = "nfs-ganesha-proxy-3.3+git0.39e0cf712-5.9.aarch64.rpm"
RPM_HASH = "ad0e946ef048ca4f5930deaf3f2f31142754df2284123b07249924916b4040a2957f311a1314536302a560d192c086d49205418458e6ed16d8da161bfee5322c"

RPROVIDES:${PN} += "libfsalproxy.so \
nfs-ganesha-proxy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libganesha-nfsd.so.3.3 \
libntirpc.so.3.3 \
liburcu-bp.so.8 \
nfs-ganesha"

inherit rpm
