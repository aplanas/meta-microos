SUMMARY = "Development files for lzo"
DESCRIPTION = "LZO is a portable lossless data compression library written in ANSI C. \
Decompression requires no memory. LZO is suitable for data \
de-/compression in real-time. This means it favours speed over \
compression ratio."
LICENSE = "GPL-2.0-or-later"

PV = "2.10"

RPM_NAME = "lzo-devel-static-2.10-8.3.aarch64.rpm"
RPM_HASH = "dd7472f7c394a47aa7d5b1e552544ab12b2be1e47e6969be61407b395cecda3f83a8a9471c8dccf584ec5d27742ec60927105fb58959396aa64af1c8839f3ead"

RPROVIDES:${PN} += "lzo-devel-/usr/lib64/liblzo.a \
lzo-devel-static"

RDEPENDS:${PN} += "lzo-devel"

inherit rpm
