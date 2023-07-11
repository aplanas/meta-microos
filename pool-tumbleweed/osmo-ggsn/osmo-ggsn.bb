SUMMARY = "GPRS Support Node"
DESCRIPTION = "Osmo-GGSN is a C-language implementation of a GGSN (Gateway GPRS \
Support Node), a core network element of ETSI/3GPP cellular networks \
such as GPRS, EDGE, UMTS or HSPA."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "1.10.1"

RPM_NAME = "osmo-ggsn-1.10.1-1.2.aarch64.rpm"
RPM_HASH = "68a11662e34d68d1cbef350ade7330aa762eeb697f29d968f3a716006f8b58e71df95d39615bee195785d8526a022e0627ec7f19fb7d03b0ca2489f576d3fbf3"

RPROVIDES:${PN} += "config-osmo-ggsn \
osmo-ggsn"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgtp.so.6 \
libgtpnl.so.0 \
libosmocore.so.20 \
libosmoctrl.so.0 \
libosmogsm.so.18 \
libosmovty.so.9 \
libtalloc.so.2"

inherit rpm
