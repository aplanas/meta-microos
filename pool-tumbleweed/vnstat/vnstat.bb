SUMMARY = "Network Traffic Monitor"
DESCRIPTION = "vnStat is a network traffic monitor for Linux that keeps a log of \
daily network traffic for the selected interface(s). vnStat isn't a \
packet sniffer. The traffic information is analyzed from the /proc \
filesystem, so vnStat can be used without root permissions."
LICENSE = "GPL-2.0-only"

PV = "2.10"

RPM_NAME = "vnstat-2.10-2.3.aarch64.rpm"
RPM_HASH = "4d43853b48169b08aabb6672b06b6eae69feafc76966054d2124a98e37af211dd996c8a10e58b3c26b23c7252974e73119bb3ee83feacfa3666e92eab44356a6"

RPROVIDES:${PN} += "config-vnstat \
vnstat"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/killall \
/usr/bin/ls \
/usr/bin/sh \
/usr/bin/su \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libsqlite3.so.0"

inherit rpm
