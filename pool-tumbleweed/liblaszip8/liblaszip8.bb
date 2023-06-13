SUMMARY = "Library files for laszip"
DESCRIPTION = "A free product of rapidlasso GmbH - quickly turns bulky LAS files into \
compact LAZ files without information loss. LASzip is a compression library that \
was developed by Martin Isenburg for compressing ASPRS LAS format data in his \
LAStools. It has been provided as an LGPL-licensed stand-alone software library \
to allow other softwares that handle LAS data to read and write LASzip-compressed \
data. The BSD-licensed libLAS and the LGPL-licensed LASlib can take advantage of \
LASzip to read and write compressed data. \
 \
This package contain only the dynamic build."
LICENSE = "LGPL-2.1-or-later"

PV = "3.4.3"

RPM_NAME = "liblaszip8-3.4.3-1.13.aarch64.rpm"
RPM_HASH = "ee5d03dbf54f9c4f0d4b2fe3e48bff1f09e33b1bdbf3fb45e2f481013c7d043a1a1c298a69ded8b19b25d7a6f7b9e1abf27b9cd341a20fc809b8d73ea516ce03"

RPROVIDES:${PN} += "liblaszip.so.8()(64bit) \
liblaszip8 \
liblaszip8(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
