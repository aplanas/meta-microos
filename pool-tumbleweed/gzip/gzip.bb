SUMMARY = "GNU Zip Compression Utilities"
DESCRIPTION = "Gzip reduces the size of the named files using Lempel-Ziv coding LZ77. \
Whenever possible, each file is replaced by one with the extension .gz, \
while keeping the same ownership modes and access and modification \
times."
LICENSE = "GPL-3.0-or-later"

PV = "1.13"

RPM_NAME = "gzip-1.13-1.1.aarch64.rpm"
RPM_HASH = "f972c502a7dc97da1817c6225f0adeaa91a711f14d0dd67f472f2148e372f430c9079bae8f268b41c8c5e58777529089aa9c3dbc4ef0995ae11df9aec0b17465"

RPROVIDES:${PN} += "alternative-gzip \
gzip"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
