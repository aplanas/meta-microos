SUMMARY = "Lossless Data Compressor based on LZMA"
DESCRIPTION = "Clzip is a lossless data compressor based on the LZMA algorithm, with \
very safe integrity checking and a user interface similar to that of \
gzip or bzip2. Clzip decompresses almost as fast as gzip and \
compresses better than bzip2, which makes it well suited for software \
distribution and data archiving. Clzip uses the lzip file format; the \
files produced by clzip are fully compatible with lzip-1.4 or newer. \
Clzip is, in fact, a C language implementation of lzip, intended for \
embedded devices or systems lacking a C++ compiler."
LICENSE = "GPL-2.0-or-later"

PV = "1.13"

RPM_NAME = "clzip-1.13-1.8.aarch64.rpm"
RPM_HASH = "3733ebe19ea540710a884a424a7bc5bb034e34070dcdfd232e78b7eb9e3f43dd6210ce164137ec4319e47cae2c94f9d7f1dae7ad77b8ecc78db6b25b1eb87a4b"

RPROVIDES:${PN} += "clzip"

RDEPENDS:${PN} += "/usr/bin/sh \
info \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
