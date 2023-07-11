SUMMARY = "A distributed multi-protocol load testing tool"
DESCRIPTION = "tsung is a distributed load testing tool. \
It is protocol-independent and can currently be used to stress and \
benchmark HTTP, Jabber/XMPP, PostgreSQL, MySQL and LDAP servers. \
It simulates user behaviour using an XML description file, reports \
many measurements in real time (statistics can be customized with \
transactions, and graphics generated using gnuplot). \
For HTTP, it supports 1.0 and 1.1, has a proxy mode to record \
sessions, supports GET and POST methods, Cookies, and Basic \
WWW-authentication. It also has support for SSL. \
 \
More information is available at http://tsung.erlang-projects.org/ ."
LICENSE = "GPL-2.0-only"

PV = "1.7.0"

RPM_NAME = "tsung-1.7.0-1.16.aarch64.rpm"
RPM_HASH = "d7eac10cf5d81529a74eda83a22efb81d2950c3f15b046dca6bf3b6bf7a5c65082a362e209fbb884415a6832dd265131e2c13328d7a8e217441839ef5e2df4d4"

RPROVIDES:${PN} += "tsung"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/perl \
bash \
erlang \
perl-Template \
python2"

inherit rpm
