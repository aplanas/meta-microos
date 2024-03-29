SUMMARY = "Self Contained SQLite RDBMS in a DBI Driver"
DESCRIPTION = "SQLite is a public domain file-based relational database engine that you \
can find at https://www.sqlite.org/. \
 \
*DBD::SQLite* is a Perl DBI driver for SQLite, that includes the entire \
thing in the distribution. So in order to get a fast transaction capable \
RDBMS working for your perl project you simply have to install this module, \
and *nothing* else. \
 \
SQLite supports the following features: \
 \
* Implements a large subset of SQL92 \
 \
See https://www.sqlite.org/lang.html for details. \
 \
* A complete DB in a single disk file \
 \
Everything for your database is stored in a single disk file, making it \
easier to move things around than with DBD::CSV. \
 \
* Atomic commit and rollback \
 \
Yes, *DBD::SQLite* is small and light, but it supports full transactions! \
 \
* Extensible \
 \
User-defined aggregate or regular functions can be registered with the SQL \
parser. \
 \
There's lots more to it, so please refer to the docs on the SQLite web \
page, listed above, for SQL details. Also refer to DBI for details on how \
to use DBI itself. The API works like every DBI module does. However, \
currently many statement attributes are not implemented or are limited by \
the typeless nature of the SQLite database."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.72"

RPM_NAME = "perl-DBD-SQLite-1.72-1.5.aarch64.rpm"
RPM_HASH = "e5c86f4d973e2733c54000dd94ef558828262410c98d322832950ce579a3fde40631b67071921f8ee8bf040ee7faa516b8d6445e9be7bd80d5ae0f1b4a2521b4"

RPROVIDES:${PN} += "perl-DBD--SQLite \
perl-DBD--SQLite--Constants \
perl-DBD--SQLite--GetInfo \
perl-DBD--SQLite--VirtualTable \
perl-DBD--SQLite--VirtualTable--Cursor \
perl-DBD--SQLite--VirtualTable--FileContent \
perl-DBD--SQLite--VirtualTable--FileContent--Cursor \
perl-DBD--SQLite--VirtualTable--PerlData \
perl-DBD--SQLite--VirtualTable--PerlData--Cursor \
perl-DBD-SQLite"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlite3.so.0 \
perl--MODULE-COMPAT-5.38.0 \
perl-DBI \
perl-Test--More"

inherit rpm
