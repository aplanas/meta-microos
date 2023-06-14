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

RPM_NAME = "tsung-1.7.0-1.15.aarch64.rpm"
RPM_HASH = "8d1ce0f42f0fe50dc024aed5500174b2550b439d5b611125e34d1d502f233d1c13dade24ec394c0c9acdf8cf7804918d7ea634806b0a8f9ec38a1c9539b6a24b"

RPROVIDES:${PN} += "tsung"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/perl \
bash \
erlang \
perl-Template \
python2"

inherit rpm
