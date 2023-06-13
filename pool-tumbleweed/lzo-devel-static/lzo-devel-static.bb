SUMMARY = "Development files for lzo"
DESCRIPTION = "LZO is a portable lossless data compression library written in ANSI C. \
Decompression requires no memory. LZO is suitable for data \
de-/compression in real-time. This means it favours speed over \
compression ratio."
LICENSE = "GPL-2.0-or-later"

PV = "2.10"

RPM_NAME = "lzo-devel-static-2.10-8.2.aarch64.rpm"
RPM_HASH = "98a2fa8482defd12f5fec327134cd88a078dd5d326d975bc52fd14a984169cdbeef83ca16abe64576fa8697a9c3dfc22292d974ea413fd418bc320ad437c987c"

RPROVIDES:${PN} += "lzo-devel-static \
lzo-devel-static(aarch-64) \
lzo-devel:/usr/lib64/liblzo.a"

RDEPENDS:${PN} += "lzo-devel"

inherit rpm
