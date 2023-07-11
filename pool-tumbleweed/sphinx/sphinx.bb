SUMMARY = "SQL full-text search engine"
DESCRIPTION = "Sphinx is a standalone search engine providing size-efficient and \
relevant full-text search functions to other applications. Sphinx \
integrates with SQL databases and scripting languages. \
 \
Data source drivers support fetching data either via direct \
connection to MySQL, PostgreSQL, or from a pipe in a custom XML \
format. \
 \
The Search API is natively ported to PHP, Python, Perl, Ruby, Java, \
and also available as a pluggable MySQL storage engine. \
 \
Sphinx is an acronym which is officially decoded as SQL Phrase Index."
LICENSE = "GPL-2.0-only"

PV = "2.2.11"

RPM_NAME = "sphinx-2.2.11-7.8.aarch64.rpm"
RPM_HASH = "e41f0fefab3d44a3bc7781c5f794fe00c3e7e44b266973447d690e6ff26aa7fc399c94e648d45d167d8f45ef44994eeac1ad4fb755731694dbf47de014241790"

RPROVIDES:${PN} += "config-sphinx \
searchd \
sphinx"

RDEPENDS:${PN} += "/usr/bin/getent \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
/usr/sbin/useradd \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libmariadb.so.3 \
libpq.so.5 \
libstdc++.so.6 \
libz.so.1 \
logrotate"

inherit rpm
