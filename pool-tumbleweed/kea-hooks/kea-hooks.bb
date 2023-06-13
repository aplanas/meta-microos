SUMMARY = "Standard Kea DHCP hooks/plugins"
DESCRIPTION = "A standard set of external libraries used to provide additional \
functionality for Kea DHCP server"
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "kea-hooks-2.2.0-2.4.aarch64.rpm"
RPM_HASH = "bf09e159137ca4786599a24a8974b4af16798213998648de22a7f7cc917693d5d3c4294e94c997f00fe9ed865135235ec22cb2dc20dcc31df216db972d34cb20"

RPROVIDES:${PN} += "kea-hooks \
kea-hooks(aarch-64) \
libdhcp_bootp.so()(64bit) \
libdhcp_flex_option.so()(64bit) \
libdhcp_ha.so()(64bit) \
libdhcp_lease_cmds.so()(64bit) \
libdhcp_mysql_cb.so()(64bit) \
libdhcp_pgsql_cb.so()(64bit) \
libdhcp_run_script.so()(64bit) \
libdhcp_stat_cmds.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libkea-asiolink.so.40()(64bit) \
libkea-cc.so.39()(64bit) \
libkea-cfgclient.so.36()(64bit) \
libkea-database.so.35()(64bit) \
libkea-dhcp++.so.54()(64bit) \
libkea-dhcpsrv.so.69()(64bit) \
libkea-eval.so.39()(64bit) \
libkea-exceptions.so.13()(64bit) \
libkea-hooks.so.57()(64bit) \
libkea-http.so.42()(64bit) \
libkea-log.so.35()(64bit) \
libkea-mysql.so.38()(64bit) \
libkea-pgsql.so.36()(64bit) \
libkea-process.so.40()(64bit) \
libkea-stats.so.18()(64bit) \
libkea-util.so.52()(64bit) \
libmariadb.so.3()(64bit) \
libmariadb.so.3(libmysqlclient_18)(64bit)"

inherit rpm
