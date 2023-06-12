SUMMARY = "Fast, safe DBI connection and transaction management"
DESCRIPTION = "DBIx::Connector provides a simple interface for fast and safe DBI \
connection and transaction management. Connecting to a database can be \
expensive; you don't want your application to re-connect every time you \
need to run a query. The efficient thing to do is to hang on to a database \
handle to maintain a connection to the database in order to minimize that \
overhead. DBIx::Connector lets you do that without having to worry about \
dropped or corrupted connections. \
 \
You might be familiar with Apache::DBI and with the DBI's \
'connect_cached()' constructor. DBIx::Connector serves a similar need, but \
does a much better job. How is it different? I'm glad you asked!"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.58"

RPM_NAME = "perl-DBIx-Connector-0.58-1.2.noarch.rpm"
RPM_HASH = "d6ad22289a076f62dff2d80fee6853ec63a9986cf8f67f3e7ad1366281ad225de3ca0250851142b318348bed31b4c26adbc58447b29ab9ea5981c1e5d37aa866"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(DBIx::Connector) \
perl(DBIx::Connector::Driver) \
perl(DBIx::Connector::Driver::Firebird) \
perl(DBIx::Connector::Driver::MSSQL) \
perl(DBIx::Connector::Driver::Oracle) \
perl(DBIx::Connector::Driver::Pg) \
perl(DBIx::Connector::Driver::SQLite) \
perl(DBIx::Connector::Driver::mysql) \
perl(DBIx::Connector::RollbackError) \
perl(DBIx::Connector::SvpRollbackError) \
perl(DBIx::Connector::TxnRollbackError) \
perl-DBIx-Connector"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(DBI)"

inherit rpm
