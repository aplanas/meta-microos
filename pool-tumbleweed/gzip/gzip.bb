SUMMARY = "GNU Zip Compression Utilities"
DESCRIPTION = "Gzip reduces the size of the named files using Lempel-Ziv coding LZ77. \
Whenever possible, each file is replaced by one with the extension .gz, \
while keeping the same ownership modes and access and modification \
times."
LICENSE = "GPL-3.0-or-later"

PV = "1.12"

RPM_NAME = "gzip-1.12-3.3.aarch64.rpm"
RPM_HASH = "fc1c54abdaf1cb1257bdc13d4783dc204d9ca7a22ad3148300a2698703b6ba797c1c90f6200df2c8f2a4376f20ffac2dc164d13cff469c9a5769b8993613ee6c"

RPROVIDES:${PN} += "alternative(gzip) \
gzip \
gzip(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/bash \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
