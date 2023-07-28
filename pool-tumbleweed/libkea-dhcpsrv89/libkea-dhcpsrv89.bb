SUMMARY = "Kea DHCP server component library"
DESCRIPTION = "This library contains code used for the DHCPv4 and DHCPv6 servers' \
operations, including the 'Lease Manager' that manages information \
about leases and the 'Configuration Manager' that stores the servers' \
configuration etc."
LICENSE = "MPL-2.0"

PV = "2.4.0"

RPM_NAME = "libkea-dhcpsrv89-2.4.0-1.1.aarch64.rpm"
RPM_HASH = "6340caf890480cb1e52f6c7c984a4b852948ee6cf37ab9c4b5b2c6dffdc9444ff8b25ac21e29fbb9bc72e80c598debae2b8c1692d1d80da6e777ce39d1326c41"

RPROVIDES:${PN} += "libkea-dhcpsrv.so.89 \
libkea-dhcpsrv89"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkea-asiolink.so.56 \
libkea-cc.so.54 \
libkea-cryptolink.so.38 \
libkea-database.so.48 \
libkea-dhcp++.so.73 \
libkea-dhcp-ddns.so.41 \
libkea-eval.so.52 \
libkea-exceptions.so.23 \
libkea-hooks.so.77 \
libkea-log.so.48 \
libkea-mysql.so.53 \
libkea-pgsql.so.53 \
libkea-process.so.57 \
libkea-stats.so.29 \
libkea-util.so.68 \
libmariadb.so.3 \
libpq.so.5 \
libstdc++.so.6"

inherit rpm
