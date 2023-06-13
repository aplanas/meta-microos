SUMMARY = "MySQL driver for the Perl5 Database Interface (DBI)"
DESCRIPTION = "*DBD::mysql* is the Perl5 Database Interface driver for the MySQL database. \
In other words: DBD::mysql is an interface between the Perl programming \
language and the MySQL programming API that comes with the MySQL relational \
database management system. Most functions provided by this programming API \
are supported. Some rarely used functions are missing, mainly because \
no-one ever requested them. :-)"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "4.050"

RPM_NAME = "perl-DBD-mysql-4.050-2.25.aarch64.rpm"
RPM_HASH = "138b95a6d5cbca709691279bfc0487567ad7d7ad245c7fb3f65cd3e57dee04209b4ca0ed28fe5fb7020537dff009703d0438530551e2bbde8bec8e48bd40c462"

RPROVIDES:${PN} += "perl(Bundle::DBD::mysql) \
perl(DBD::mysql) \
perl(DBD::mysql::GetInfo) \
perl(DBD::mysql::db) \
perl(DBD::mysql::dr) \
perl(DBD::mysql::st) \
perl-DBD-mysql \
perl-DBD-mysql(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libmariadb.so.3()(64bit) \
libmariadb.so.3(libmysqlclient_18)(64bit) \
perl(:MODULE_COMPAT_5.36.0) \
perl(DBI)"

inherit rpm
