SUMMARY = "Accounting and aggregation toolsuite for IPv4 and IPv6"
DESCRIPTION = "pmacct is a set of passive network monitoring tools to measure, account, \
classify and aggregate IPv4 and IPv6 traffic; a pluggable \
architecture allows to store the collected traffic data into memory tables or \
SQL (MySQL, SQLite, PostgreSQL) databases. pmacct supports customizable \
historical data breakdown, flow sampling, filtering and tagging, recovery \
actions, and triggers. Libpcap, sFlow v2/v4/v5 and NetFlow v1/v5/v7/v8/v9 are \
supported, both unicast and multicast. A client program can export \
export data to tools like RRDtool, GNUPlot, Net-SNMP, MRTG, and Cacti."
LICENSE = "GPL-2.0-only"

PV = "1.7.8"

RPM_NAME = "pmacct-1.7.8-1.4.aarch64.rpm"
RPM_HASH = "8bc5aafa4cf989785ec964f55ad77dcc23a801312f93f70f8f09dd081820a046b025a8dd36a39fe935086b181777cb29d7968e0e985707d2b1fb40f5d3316995"

RPROVIDES:${PN} += "config(pmacct) \
pmacct \
pmacct(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libjansson.so.4()(64bit) \
libjansson.so.4(libjansson.so.4)(64bit) \
libmariadb.so.3()(64bit) \
libmariadb.so.3(libmysqlclient_18)(64bit) \
libmaxminddb.so.0()(64bit) \
libnetfilter_log.so.1()(64bit) \
libpcap.so.1()(64bit) \
libpq.so.5()(64bit) \
libsqlite3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
