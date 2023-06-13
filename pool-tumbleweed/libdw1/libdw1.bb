SUMMARY = "Library to access DWARF debugging information"
DESCRIPTION = "This package provides a high-level library to access the DWARF debugging \
information. This is part of the elfutils package."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "libdw1-0.189-3.1.aarch64.rpm"
RPM_HASH = "e58e4e89eac8b580fc26eb31570fd80f0ac5f970c77f6bcb7a7b82d418f374c70dfd5d2c0e19a527519ab40b4717dce4d7ca9c378c90558c03c87a87d5e1309c"

RPROVIDES:${PN} += "libdw.so.1()(64bit) \
libdw.so.1(ELFUTILS_0)(64bit) \
libdw1 \
libdw1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6()(64bit) \
libelf.so.1()(64bit) \
liblzma.so.5()(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
