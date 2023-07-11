SUMMARY = "Standard Kea DHCP hooks/plugins"
DESCRIPTION = "A standard set of external libraries used to provide additional \
functionality for Kea DHCP server"
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "kea-hooks-2.2.0-2.6.aarch64.rpm"
RPM_HASH = "4ea7fef851cc4e5f90060022f9d0b14c28b12d436ba97a7edcc58038e12dbafb9a0b4299ee101076294cb8700bc86c65d697e6d17c42194ce9e55502bd610331"

RPROVIDES:${PN} += "kea-hooks \
libdhcp-bootp.so \
libdhcp-flex-option.so \
libdhcp-ha.so \
libdhcp-lease-cmds.so \
libdhcp-mysql-cb.so \
libdhcp-pgsql-cb.so \
libdhcp-run-script.so \
libdhcp-stat-cmds.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libkea-asiolink.so.40 \
libkea-cc.so.39 \
libkea-cfgclient.so.36 \
libkea-database.so.35 \
libkea-dhcp++.so.54 \
libkea-dhcpsrv.so.69 \
libkea-eval.so.39 \
libkea-exceptions.so.13 \
libkea-hooks.so.57 \
libkea-http.so.42 \
libkea-log.so.35 \
libkea-mysql.so.38 \
libkea-pgsql.so.36 \
libkea-process.so.40 \
libkea-stats.so.18 \
libkea-util.so.52 \
libmariadb.so.3"

inherit rpm
