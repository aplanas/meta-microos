SUMMARY = "Kernel dump file access library"
DESCRIPTION = "A library that provides an abstraction layer for reading kernel dump \
core files.  It supports different kernel dump core formats, virtual \
to physical translation, Xen mappings and more. \
 \
This package contains the libkdumpfile library."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.5.1+git3.g97c716a"

RPM_NAME = "libkdumpfile10-0.5.1+git3.g97c716a-3.2.aarch64.rpm"
RPM_HASH = "f55ac2c4352d0b9440abb770ed986a0bfac296b6ec3b4c34ea3be67991a2c6a50fa362b2432a94bf08a4be22998076558bef1b0a52bfbe0dc1a137ca053a5b97"

RPROVIDES:${PN} += "libkdumpfile.so.10 \
libkdumpfile10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaddrxlat.so.3 \
libc.so.6 \
liblzo2.so.2 \
libsnappy.so.1 \
libz.so.1 \
libzstd.so.1"

inherit rpm
