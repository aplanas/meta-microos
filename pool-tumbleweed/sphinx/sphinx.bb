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

RPM_NAME = "sphinx-2.2.11-7.7.aarch64.rpm"
RPM_HASH = "ad44e1db98d0b04700cf3e2f5ada37663c2cea7d6c91c70ec3014a058cf57c92a9874a9ca13fb6315c6583082e03926b9cd8db91a5b799a7511528d60e881e4e"

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
