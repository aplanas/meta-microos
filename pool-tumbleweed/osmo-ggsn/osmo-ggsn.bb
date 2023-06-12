SUMMARY = "GPRS Support Node"
DESCRIPTION = "Osmo-GGSN is a C-language implementation of a GGSN (Gateway GPRS \
Support Node), a core network element of ETSI/3GPP cellular networks \
such as GPRS, EDGE, UMTS or HSPA."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "1.10.1"

RPM_NAME = "osmo-ggsn-1.10.1-1.1.aarch64.rpm"
RPM_HASH = "00d56f996175f2842dc060774879ff8940377079126021f011f0a452663241f7a91269d374851c10f6698c9c600603e873df2213acbb8fc0cd0af302df18ce28"

RPROVIDES:${PN} += "config(osmo-ggsn) \
osmo-ggsn \
osmo-ggsn(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgtp.so.6()(64bit) \
libgtpnl.so.0()(64bit) \
libgtpnl.so.0(LIBGTPNL_1.0)(64bit) \
libosmocore.so.20()(64bit) \
libosmoctrl.so.0()(64bit) \
libosmoctrl.so.0(LIBOSMOCTRL_1.0)(64bit) \
libosmogsm.so.18()(64bit) \
libosmogsm.so.18(LIBOSMOGSM_1.0)(64bit) \
libosmovty.so.9()(64bit) \
libtalloc.so.2()(64bit) \
libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
