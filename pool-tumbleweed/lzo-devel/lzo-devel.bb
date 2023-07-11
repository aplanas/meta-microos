SUMMARY = "Development files for lzo"
DESCRIPTION = "LZO is a portable lossless data compression library written in ANSI C. \
Decompression requires no memory. LZO is suitable for data \
de-/compression in real-time. This means it favours speed over \
compression ratio."
LICENSE = "GPL-2.0-or-later"

PV = "2.10"

RPM_NAME = "lzo-devel-2.10-8.3.aarch64.rpm"
RPM_HASH = "e649db38fe33ef94e2a8492d2b238da6b34f2027bb91029856424d8c493b16b142ea1289cd4cd45d180d5e0fd8134e939e956acd9293254998ef25a357a971d7"

RPROVIDES:${PN} += "lzo-devel \
pkgconfig-lzo2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblzo2-2"

inherit rpm
