SUMMARY = "Kea DHCP server component library"
DESCRIPTION = "This library contains code used for the DHCPv4 and DHCPv6 servers' \
operations, including the 'Lease Manager' that manages information \
about leases and the 'Configuration Manager' that stores the servers' \
configuration etc."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-dhcpsrv69-2.2.0-2.6.aarch64.rpm"
RPM_HASH = "b8c8db232466f886e42e86fbfa8fec378fe628d39b44e1997f1864317fe5b073c1fee16c5165d394fe3e9b8a9b2533b78bd00bd8d31ff1d25a08fe4c87cc7320"

RPROVIDES:${PN} += "libkea-dhcpsrv.so.69 \
libkea-dhcpsrv69"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkea-asiolink.so.40 \
libkea-cc.so.39 \
libkea-cryptolink.so.28 \
libkea-database.so.35 \
libkea-dhcp++.so.54 \
libkea-dhcp-ddns.so.29 \
libkea-eval.so.39 \
libkea-exceptions.so.13 \
libkea-hooks.so.57 \
libkea-log.so.35 \
libkea-mysql.so.38 \
libkea-pgsql.so.36 \
libkea-process.so.40 \
libkea-stats.so.18 \
libkea-util.so.52 \
libmariadb.so.3 \
libpq.so.5 \
libstdc++.so.6"

inherit rpm
