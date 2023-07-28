SUMMARY = "Standard Kea DHCP hooks/plugins"
DESCRIPTION = "A standard set of external libraries used to provide additional \
functionality for Kea DHCP server"
LICENSE = "MPL-2.0"

PV = "2.4.0"

RPM_NAME = "kea-hooks-2.4.0-1.1.aarch64.rpm"
RPM_HASH = "ad873a1f1fd904b4a9fb8ff46b01b79f450e8791716b169dab5c0fdbbac53fa7f18b07adee569f2fa0f118967dc561e46db2b5ce8d7a9a60d205b9b9f7090d33"

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
libkea-asiolink.so.56 \
libkea-cc.so.54 \
libkea-cfgclient.so.51 \
libkea-database.so.48 \
libkea-dhcp++.so.73 \
libkea-dhcpsrv.so.89 \
libkea-eval.so.52 \
libkea-exceptions.so.23 \
libkea-hooks.so.77 \
libkea-http.so.56 \
libkea-log.so.48 \
libkea-mysql.so.53 \
libkea-pgsql.so.53 \
libkea-process.so.57 \
libkea-stats.so.29 \
libkea-util.so.68 \
libmariadb.so.3"

inherit rpm
