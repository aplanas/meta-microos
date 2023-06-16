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

RPM_NAME = "clzip-1.13-1.7.aarch64.rpm"
RPM_HASH = "4d0832ca54aab57acbfee1bef3f01899ca9b158603d03a415dc00ab260d2ed5b05e35b6238dd7a31ab6d060c5db15be06259f92d882d400469817fb38e039e55"

RPROVIDES:${PN} += "clzip"

RDEPENDS:${PN} += "/usr/bin/sh \
info \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
