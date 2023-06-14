SUMMARY = "Utility to repair broken lzip files"
DESCRIPTION = "Lziprecover is a data recovery tool and decompressor for files in the \
lzip compressed data format (.lz) able to repair slightly damaged \
files, recover badly damaged files from two or more copies, extract \
undamaged members from multi-member files, decompress files and test \
integrity of files. \
 \
Lziprecover is able to recover or decompress files produced by any of \
the compressors in the lzip family; lzip, plzip, minilzip/lzlib, \
clzip and pdlzip. This recovery capability contributes to make the \
lzip format one of the best options for long-term data archiving. \
 \
Lziprecover is able to efficiently extract a range of bytes from a \
multi-member file, because it only decompresses the members \
containing the desired data. \
 \
Lziprecover can print correct total file sizes and ratios even for \
multi-member files."
LICENSE = "GPL-2.0-or-later"

PV = "1.23"

RPM_NAME = "lziprecover-1.23-1.7.aarch64.rpm"
RPM_HASH = "1af6c7a2b874e7a6d90713076d1736ca6ced6a0cb2a0d1a0f5b5907e10d883c9ccec7f13a3cfac924ac5d562435ad5f0e83acea721af803475e8043c27a86b00"

RPROVIDES:${PN} += "lziprecover"

RDEPENDS:${PN} += "/bin/sh \
info \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
