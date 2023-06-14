SUMMARY = "Kea DHCP server component library"
DESCRIPTION = "This library contains code used for the DHCPv4 and DHCPv6 servers' \
operations, including the 'Lease Manager' that manages information \
about leases and the 'Configuration Manager' that stores the servers' \
configuration etc."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-dhcpsrv69-2.2.0-2.4.aarch64.rpm"
RPM_HASH = "d2861aa9b3d9328c9f4b7838a2021d6b32c9b76c879bc7e0d41233e27da1e0191f720b5efb5f498637533c102cdb69605be6a1203f1f1b61123163422a3ca7f1"

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
