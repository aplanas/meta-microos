SUMMARY = "A Real-Time Data Compression Library"
DESCRIPTION = "LZO is a portable lossless data compression library written in ANSI C. \
Decompression requires no memory. LZO is suitable for data compression \
and decompression in real-time. This means it favors speed over \
compression ratio."
LICENSE = "GPL-2.0-or-later"

PV = "2.10"

RPM_NAME = "liblzo2-2-2.10-8.3.aarch64.rpm"
RPM_HASH = "51338be400813140307725efd99986623e22c094c57b88c7e1b9b867a087362e65f3d39950dba83ecf176e7fa734af4485f3cbfb0cba8c7c7483c735000fccd6"

RPROVIDES:${PN} += "liblzo2-2 \
liblzo2.so.2 \
lzo"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
