SUMMARY = "NFS-Ganesha NFSD shared library"
DESCRIPTION = "This package contains the NFSD shared library from NFS-Ganesha."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.3+git0.39e0cf712"

RPM_NAME = "libganesha_nfsd3_3-3.3+git0.39e0cf712-5.8.aarch64.rpm"
RPM_HASH = "a6af63be8f6ccd49d829b3226dbe565992d3da6ea37d2a24c79a794f35e0e2d3c0390c8715152e79b305bd28372417e3eafe0e58ab92a5aa61c2fb64b7b14410"

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
