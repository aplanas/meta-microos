SUMMARY = "GNU Zip Compression Utilities"
DESCRIPTION = "Gzip reduces the size of the named files using Lempel-Ziv coding LZ77. \
Whenever possible, each file is replaced by one with the extension .gz, \
while keeping the same ownership modes and access and modification \
times."
LICENSE = "GPL-3.0-or-later"

PV = "1.12"

RPM_NAME = "gzip-1.12-3.5.aarch64.rpm"
RPM_HASH = "4efc062a18d387bf84a37fff6aa5a0177da0411043fd6950c0c6775ff396551077b3ea86aafd94d3d1c95f0de89e6ad15e26f1dbed38a2f1f2ef9df0f1c63fb9"

RPROVIDES:${PN} += "alternative-gzip \
gzip"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
