SUMMARY = "Library to access DWARF debugging information"
DESCRIPTION = "This package provides a high-level library to access the DWARF debugging \
information. This is part of the elfutils package."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "libdw1-0.189-3.1.aarch64.rpm"
RPM_HASH = "e58e4e89eac8b580fc26eb31570fd80f0ac5f970c77f6bcb7a7b82d418f374c70dfd5d2c0e19a527519ab40b4717dce4d7ca9c378c90558c03c87a87d5e1309c"

RPROVIDES:${PN} += "libdw.so.1()(64bit) \
libdw.so.1(ELFUTILS_0)(64bit) \
libdw.so.1(ELFUTILS_0.122)(64bit) \
libdw.so.1(ELFUTILS_0.126)(64bit) \
libdw.so.1(ELFUTILS_0.127)(64bit) \
libdw.so.1(ELFUTILS_0.130)(64bit) \
libdw.so.1(ELFUTILS_0.136)(64bit) \
libdw.so.1(ELFUTILS_0.138)(64bit) \
libdw.so.1(ELFUTILS_0.142)(64bit) \
libdw.so.1(ELFUTILS_0.143)(64bit) \
libdw.so.1(ELFUTILS_0.144)(64bit) \
libdw.so.1(ELFUTILS_0.146)(64bit) \
libdw.so.1(ELFUTILS_0.148)(64bit) \
libdw.so.1(ELFUTILS_0.149)(64bit) \
libdw.so.1(ELFUTILS_0.156)(64bit) \
libdw.so.1(ELFUTILS_0.157)(64bit) \
libdw.so.1(ELFUTILS_0.158)(64bit) \
libdw.so.1(ELFUTILS_0.159)(64bit) \
libdw.so.1(ELFUTILS_0.160)(64bit) \
libdw.so.1(ELFUTILS_0.161)(64bit) \
libdw.so.1(ELFUTILS_0.165)(64bit) \
libdw.so.1(ELFUTILS_0.167)(64bit) \
libdw.so.1(ELFUTILS_0.170)(64bit) \
libdw.so.1(ELFUTILS_0.171)(64bit) \
libdw.so.1(ELFUTILS_0.173)(64bit) \
libdw.so.1(ELFUTILS_0.175)(64bit) \
libdw.so.1(ELFUTILS_0.177)(64bit) \
libdw.so.1(ELFUTILS_0.186)(64bit) \
libdw.so.1(ELFUTILS_0.188)(64bit) \
libdw1 \
libdw1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbz2.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libelf.so.1()(64bit) \
libelf.so.1(ELFUTILS_1.0)(64bit) \
libelf.so.1(ELFUTILS_1.1.1)(64bit) \
libelf.so.1(ELFUTILS_1.3)(64bit) \
libelf.so.1(ELFUTILS_1.5)(64bit) \
libelf.so.1(ELFUTILS_1.6)(64bit) \
libelf.so.1(ELFUTILS_1.7)(64bit) \
liblzma.so.5()(64bit) \
liblzma.so.5(XZ_5.0)(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.2.3)(64bit) \
libzstd.so.1()(64bit)"

inherit rpm