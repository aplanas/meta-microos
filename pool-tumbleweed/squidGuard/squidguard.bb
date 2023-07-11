SUMMARY = "Filter plugin for squid"
DESCRIPTION = "SquidGuard is a filter, redirector, and access controller plugin for squid. \
It lets you define multiple access rules with different restrictions for \
different user groups on a squid cache. SquidGuard uses squid's standard \
redirector interface."
LICENSE = "GPL-2.0-only"

PV = "1.6.0"

RPM_NAME = "squidGuard-1.6.0-1.15.aarch64.rpm"
RPM_HASH = "fb20d8c72a7540524a5877aec66206b84f4938f4208118a9c3164ed8f19beb636dce8b5d192d4b6186d2b26b30025749c68ff3196fb14b6223313fb51b6279bd"

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
