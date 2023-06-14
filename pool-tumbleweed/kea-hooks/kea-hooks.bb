SUMMARY = "Standard Kea DHCP hooks/plugins"
DESCRIPTION = "A standard set of external libraries used to provide additional \
functionality for Kea DHCP server"
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "kea-hooks-2.2.0-2.4.aarch64.rpm"
RPM_HASH = "bf09e159137ca4786599a24a8974b4af16798213998648de22a7f7cc917693d5d3c4294e94c997f00fe9ed865135235ec22cb2dc20dcc31df216db972d34cb20"

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
