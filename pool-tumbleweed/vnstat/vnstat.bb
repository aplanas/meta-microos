SUMMARY = "Network Traffic Monitor"
DESCRIPTION = "vnStat is a network traffic monitor for Linux that keeps a log of \
daily network traffic for the selected interface(s). vnStat isn't a \
packet sniffer. The traffic information is analyzed from the /proc \
filesystem, so vnStat can be used without root permissions."
LICENSE = "GPL-2.0-only"

PV = "2.10"

RPM_NAME = "vnstat-2.10-2.2.aarch64.rpm"
RPM_HASH = "60b27090918516c037e144a5881a32d6f4195ad7f17775eddab54319ce990c5d6930740a87d3f2236a9fcab7c9b6c5020e71a3909651e59f4940e7c2c4eb3589"

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
