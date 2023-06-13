SUMMARY = "Filter plugin for squid"
DESCRIPTION = "SquidGuard is a filter, redirector, and access controller plugin for squid. \
It lets you define multiple access rules with different restrictions for \
different user groups on a squid cache. SquidGuard uses squid's standard \
redirector interface."
LICENSE = "GPL-2.0-only"

PV = "1.6.0"

RPM_NAME = "squidGuard-1.6.0-1.14.aarch64.rpm"
RPM_HASH = "cac9946137b80948218d03c2a7698980db20ca138118ee3cbceae6d2d6ce6fde399e805887a7073149375b49b258de1a03299cb67032fc6cd3e2c86d06c0f60b"

RPROVIDES:${PN} += "config(squidGuard) \
squidGuard \
squidGuard(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/perl \
http_proxy \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdb-4.8.so()(64bit) \
libldap.so.2()(64bit) \
libldap.so.2(OPENLDAP_2.200)(64bit) \
libmariadb.so.3()(64bit) \
libmariadb.so.3(libmysqlclient_18)(64bit)"

inherit rpm
