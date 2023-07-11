SUMMARY = "NFS-Ganesha NFSD shared library"
DESCRIPTION = "This package contains the NFSD shared library from NFS-Ganesha."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.3+git0.39e0cf712"

RPM_NAME = "libganesha_nfsd3_3-3.3+git0.39e0cf712-5.9.aarch64.rpm"
RPM_HASH = "aba854e4f3c7149e121e3779a352700c8f558bf590566ecd8bf3357a30ae5faa006b230cca289e98b2541695b32f3aa8abce584a36f6cde789eec688c6caba1d"

RPROVIDES:${PN} += "libganesha-nfsd.so.3.3 \
libganesha-nfsd3-3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libcap.so.2 \
libcom-err.so.2 \
libdbus-1.so.3 \
libgssapi-krb5.so.2 \
libkrb5.so.3 \
libnfsidmap.so.1 \
libntirpc.so.3.3 \
liburcu-bp.so.8 \
libuuid.so.1"

inherit rpm
