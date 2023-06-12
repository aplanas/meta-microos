SUMMARY = "Library and tools to access the MS-DOS volume system format"
DESCRIPTION = "libvsmbr is a library to access the MS-DOS volume system. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20210509"

RPM_NAME = "python311-libvsmbr-20210509-4.7.aarch64.rpm"
RPM_HASH = "7c7e575115f40b19e4a7ed556a04f8e90845a425af2a7847c92495106f0de6449c12878e968c07e00d718c38294ad062d2bae8137bdc422cb87fbf280301a33c"

RPROVIDES:${PN} += "python311-libvsmbr \
python311-libvsmbr(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libvsmbr.so.1()(64bit) \
libvsmbr.so.1(V_20210509)(64bit) \
python(abi)"

inherit rpm