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

RPM_NAME = "lziprecover-1.23-1.8.aarch64.rpm"
RPM_HASH = "06a1935f5dd30d90cfc99fa155ccee92562923bb6efff4657620c47d8ed7113f688d751b572ce24cc371badea87b26dc42803bec405ba005cc3d87060f4bf005"

RPROVIDES:${PN} += "lziprecover"

RDEPENDS:${PN} += "/usr/bin/sh \
info \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
