SUMMARY = "Filter plugin for squid"
DESCRIPTION = "SquidGuard is a filter, redirector, and access controller plugin for squid. \
It lets you define multiple access rules with different restrictions for \
different user groups on a squid cache. SquidGuard uses squid's standard \
redirector interface."
LICENSE = "GPL-2.0-only"

PV = "1.6.0"

RPM_NAME = "squidGuard-1.6.0-1.14.aarch64.rpm"
RPM_HASH = "cac9946137b80948218d03c2a7698980db20ca138118ee3cbceae6d2d6ce6fde399e805887a7073149375b49b258de1a03299cb67032fc6cd3e2c86d06c0f60b"

RPROVIDES:${PN} += "config-squidGuard \
squidGuard"

RDEPENDS:${PN} += "/usr/bin/perl \
http-proxy \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdb-4.8.so \
libldap.so.2 \
libmariadb.so.3"

inherit rpm
