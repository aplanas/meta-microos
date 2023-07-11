SUMMARY = "MySQL driver for the Perl5 Database Interface (DBI)"
DESCRIPTION = "*DBD::mysql* is the Perl5 Database Interface driver for the MySQL database. \
In other words: DBD::mysql is an interface between the Perl programming \
language and the MySQL programming API that comes with the MySQL relational \
database management system. Most functions provided by this programming API \
are supported. Some rarely used functions are missing, mainly because \
no-one ever requested them. :-)"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "4.050"

RPM_NAME = "perl-DBD-mysql-4.050-2.27.aarch64.rpm"
RPM_HASH = "487866c30fa83374f228ee285f3120d389a06397e0950329de30c7f4f16bc6cda35f4b9078759803ad9b7f73eb3c6b5e81ba9e3cafc72152659a7298296818fa"

RPROVIDES:${PN} += "perl-Bundle--DBD--mysql \
perl-DBD--mysql \
perl-DBD--mysql--GetInfo \
perl-DBD--mysql--db \
perl-DBD--mysql--dr \
perl-DBD--mysql--st \
perl-DBD-mysql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmariadb.so.3 \
perl--MODULE-COMPAT-5.36.1 \
perl-DBI"

inherit rpm
