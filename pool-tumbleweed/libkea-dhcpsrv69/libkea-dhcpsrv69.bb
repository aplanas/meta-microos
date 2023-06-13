SUMMARY = "Kea DHCP server component library"
DESCRIPTION = "This library contains code used for the DHCPv4 and DHCPv6 servers' \
operations, including the 'Lease Manager' that manages information \
about leases and the 'Configuration Manager' that stores the servers' \
configuration etc."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-dhcpsrv69-2.2.0-2.4.aarch64.rpm"
RPM_HASH = "d2861aa9b3d9328c9f4b7838a2021d6b32c9b76c879bc7e0d41233e27da1e0191f720b5efb5f498637533c102cdb69605be6a1203f1f1b61123163422a3ca7f1"

RPROVIDES:${PN} += "libkea-dhcpsrv.so.69()(64bit) \
libkea-dhcpsrv69 \
libkea-dhcpsrv69(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libkea-asiolink.so.40()(64bit) \
libkea-cc.so.39()(64bit) \
libkea-cryptolink.so.28()(64bit) \
libkea-database.so.35()(64bit) \
libkea-dhcp++.so.54()(64bit) \
libkea-dhcp_ddns.so.29()(64bit) \
libkea-eval.so.39()(64bit) \
libkea-exceptions.so.13()(64bit) \
libkea-hooks.so.57()(64bit) \
libkea-log.so.35()(64bit) \
libkea-mysql.so.38()(64bit) \
libkea-pgsql.so.36()(64bit) \
libkea-process.so.40()(64bit) \
libkea-stats.so.18()(64bit) \
libkea-util.so.52()(64bit) \
libmariadb.so.3()(64bit) \
libmariadb.so.3(libmysqlclient_18)(64bit) \
libpq.so.5()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
