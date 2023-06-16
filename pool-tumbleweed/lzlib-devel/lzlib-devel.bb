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

RPM_NAME = "lzlib-devel-1.13-1.7.aarch64.rpm"
RPM_HASH = "99989c49f70aa52c82607b855ab32d54f79e7ac8acbf804304bed30b45fbd9ef17e0b8a5b88bb65320886187c9d09f1a918ff3de7d812e2dd1ff10d11efc308d"

RPROVIDES:${PN} += "lzlib-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
liblz1"

inherit rpm
