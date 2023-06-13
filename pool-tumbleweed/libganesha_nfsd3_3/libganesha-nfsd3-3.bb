SUMMARY = "NFS-Ganesha NFSD shared library"
DESCRIPTION = "This package contains the NFSD shared library from NFS-Ganesha."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.3+git0.39e0cf712"

RPM_NAME = "libganesha_nfsd3_3-3.3+git0.39e0cf712-5.8.aarch64.rpm"
RPM_HASH = "a6af63be8f6ccd49d829b3226dbe565992d3da6ea37d2a24c79a794f35e0e2d3c0390c8715152e79b305bd28372417e3eafe0e58ab92a5aa61c2fb64b7b14410"

RPROVIDES:${PN} += "libganesha_nfsd.so.3.3()(64bit) \
libganesha_nfsd3_3 \
libganesha_nfsd3_3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libblkid.so.1()(64bit) \
libblkid.so.1(BLKID_1.0)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcap.so.2()(64bit) \
libcom_err.so.2()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libgssapi_krb5.so.2()(64bit) \
libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) \
libkrb5.so.3()(64bit) \
libkrb5.so.3(krb5_3_MIT)(64bit) \
libnfsidmap.so.1()(64bit) \
libntirpc.so.3.3()(64bit) \
libntirpc.so.3.3(NTIRPC_3.3)(64bit) \
liburcu-bp.so.8()(64bit) \
libuuid.so.1()(64bit) \
libuuid.so.1(UUID_1.0)(64bit)"

inherit rpm
