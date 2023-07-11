SUMMARY = "LZMA Compression and Decompression Library"
DESCRIPTION = "The lzlib compression library provides in-memory LZMA compression and \
decompression functions, including integrity checking of the \
decompressed data. The compressed data format used by the library is \
the lzip format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libcerror."
LICENSE = "BSD-2-Clause & GPL-2.0-or-later"

PV = "1.13"

RPM_NAME = "lzlib-devel-1.13-1.8.aarch64.rpm"
RPM_HASH = "82f24bed5fcbd205fe75f34df2fb3add62aa14adc816f921dcb9639848fcee4d96682059be57ec9620418d67cc7936a371bcacedcb2053a353a63eebcf3d9f2b"

RPROVIDES:${PN} += "lzlib-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
liblz1"

inherit rpm
