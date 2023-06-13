SUMMARY = "Library and tools to access the Apple Partition Map volume system format"
DESCRIPTION = "libvsapm is a library to access the Apple Partition Map (APM) volume \
system format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20210626"

RPM_NAME = "python311-libvsapm-20210626-4.7.aarch64.rpm"
RPM_HASH = "273a0ae14c8c92e093ad047deaf56aef389c12a5d2b06e113fdfeaa543ee60445d6d48e924186cf6c84f66a6dae7c5a8768d38cd0233b0bed6f00886d4a56f6e"

RPROVIDES:${PN} += "python311-libvsapm \
python311-libvsapm(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libvsapm.so.1()(64bit) \
libvsapm.so.1(V_20210626)(64bit) \
python(abi)"

inherit rpm
