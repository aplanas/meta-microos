SUMMARY = "Provides libknet1 lz4 and lz4hc support"
DESCRIPTION = "Provides lz4 and lz4hc compression support for libknet1."
LICENSE = "GPL-2.0+ & LGPL-2.1+"

PV = "1.21"

RPM_NAME = "libknet1-compress-lz4-plugin-1.21-1.10.aarch64.rpm"
RPM_HASH = "7efc384faf76a6ebeafc867121d90b6ded5ac9d5e7862dc9db8125c6f60c9bf1437660c577eb51b2ed4cfd6d4cbb88cd9db7a79ca2da460865c6afa11a61cc83"

RPROVIDES:${PN} += "libknet1-compress-lz4-plugin \
libknet1-compress-lz4-plugin(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libknet1(aarch-64) \
liblz4.so.1()(64bit)"

inherit rpm
