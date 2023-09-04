SUMMARY = "MySQL driver for the Perl5 Database Interface (DBI)"
DESCRIPTION = "*DBD::mysql* is the Perl5 Database Interface driver for the MySQL database. \
In other words: DBD::mysql is an interface between the Perl programming \
language and the MySQL programming API that comes with the MySQL relational \
database management system. Most functions provided by this programming API \
are supported. Some rarely used functions are missing, mainly because \
no-one ever requested them. :-)"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "4.050"

RPM_NAME = "perl-DBD-mysql-4.050-2.28.aarch64.rpm"
RPM_HASH = "4825eb114f22399ce3eb1f8878abc8ea3efbbedcd680287e3409766576b18c915eefd487a2cede79a6cf40d4e799f838f3a99554b1ed39a60120692d1ac04932"

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
perl--MODULE-COMPAT-5.38.0 \
perl-DBI"

inherit rpm
