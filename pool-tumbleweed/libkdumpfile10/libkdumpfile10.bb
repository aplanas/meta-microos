SUMMARY = "Kernel dump file access library"
DESCRIPTION = "A library that provides an abstraction layer for reading kernel dump \
core files.  It supports different kernel dump core formats, virtual \
to physical translation, Xen mappings and more. \
 \
This package contains the libkdumpfile library."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.5.1+git3.g97c716a"

RPM_NAME = "libkdumpfile10-0.5.1+git3.g97c716a-3.1.aarch64.rpm"
RPM_HASH = "93bc851c9ecd4a44080847e9053a6548497a4d5b2b9ab775ab4c099060e29f867a81e89dc9a949f76648b9b4fc840bd84544aeac046a4782f793ed578694072f"

RPROVIDES:${PN} += "libkdumpfile.so.10()(64bit) \
libkdumpfile.so.10(LIBKDUMPFILE_0)(64bit) \
libkdumpfile10 \
libkdumpfile10(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libaddrxlat.so.3()(64bit) \
libaddrxlat.so.3(LIBADDRXLAT_0)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
liblzo2.so.2()(64bit) \
libsnappy.so.1()(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
