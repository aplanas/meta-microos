SUMMARY = "Graph Visualization CGI Script for vnstat"
DESCRIPTION = "vnStat is a network traffic monitor for Linux that keeps a log of \
daily network traffic for the selected interface(s). vnStat isn't a \
packet sniffer. The traffic information is analyzed from the /proc \
filesystem, so vnStat can be used without root permissions. \
 \
This package contains a CGI script that visualizes graphs of the \
collected traffic statistics."
LICENSE = "GPL-2.0-only"

PV = "2.10"

RPM_NAME = "vnstat-cgi-2.10-2.3.aarch64.rpm"
RPM_HASH = "000547f0016041fd2bbd54300ca7076c3493d04d3d5a7cd63907f13a1d357e7bfaaf0506ea07b9aec0d66f6d105dfa48c7f938e9697efac6b373e886f71f4348"

RPROVIDES:${PN} += "config-vnstat-cgi \
vnstat-cgi"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgd.so.3 \
libm.so.6 \
libsqlite3.so.0 \
vnstat"

inherit rpm
