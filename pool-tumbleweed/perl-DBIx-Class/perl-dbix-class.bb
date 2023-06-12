SUMMARY = "Extensible and flexible object <-> relational mapper"
DESCRIPTION = "This is an SQL to OO mapper with an object API inspired by Class::DBI (with \
a compatibility layer as a springboard for porting) and a resultset API \
that allows abstract encapsulation of database operations. It aims to make \
representing queries in your code as perl-ish as possible while still \
providing access to as many of the capabilities of the database as \
possible, including retrieving related records from multiple tables in a \
single query, 'JOIN', 'LEFT JOIN', 'COUNT', 'DISTINCT', 'GROUP BY', 'ORDER \
BY' and 'HAVING' support. \
 \
DBIx::Class can handle multi-column primary and foreign keys, complex \
queries and database-level paging, and does its best to only query the \
database in order to return something you've directly asked for. If a \
resultset is used as an iterator it only fetches rows off the statement \
handle as requested in order to minimise memory usage. It has \
auto-increment support for SQLite, MySQL, PostgreSQL, Oracle, SQL Server \
and DB2 and is known to be used in production on at least the first four, \
and is fork- and thread-safe out of the box (although your DBD may not be). \
 \
This project is still under rapid development, so large new features may be \
marked *experimental* - such APIs are still usable but may have edge bugs. \
Failing test cases are _always_ welcome and point releases are put out \
rapidly as bugs are found and fixed. \
 \
We do our best to maintain full backwards compatibility for published APIs, \
since DBIx::Class is used in production in many organisations, and even \
backwards incompatible changes to non-published APIs will be fixed if \
they're reported and doing so doesn't cost the codebase anything. \
 \
The test suite is quite substantial, and several developer releases are \
generally made to CPAN before the branch for the next release is merged \
back to trunk for a major release."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.082843"

RPM_NAME = "perl-DBIx-Class-0.082843-1.4.noarch.rpm"
RPM_HASH = "1382047e97ce592846fb1b1ab0a1cc366253fbb5fcaac2a3319dbd7e5ff58f24159959218394e837487a65c8e7bbb59a44d452707832b98ea6bbdf84eaab57e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(DB) \
perl(DBIx::Class) \
perl(DBIx::Class::AccessorGroup) \
perl(DBIx::Class::Admin) \
perl(DBIx::Class::CDBICompat) \
perl(DBIx::Class::CDBICompat::Iterator) \
perl(DBIx::Class::CDBICompat::SQLTransformer) \
perl(DBIx::Class::CDBICompat::Tied::ColumnValue) \
perl(DBIx::Class::Core) \
perl(DBIx::Class::Cursor) \
perl(DBIx::Class::DB) \
perl(DBIx::Class::Exception) \
perl(DBIx::Class::FilterColumn) \
perl(DBIx::Class::InflateColumn) \
perl(DBIx::Class::InflateColumn::DateTime) \
perl(DBIx::Class::InflateColumn::File) \
perl(DBIx::Class::Optional::Dependencies) \
perl(DBIx::Class::Ordered) \
perl(DBIx::Class::PK) \
perl(DBIx::Class::PK::Auto) \
perl(DBIx::Class::Relationship) \
perl(DBIx::Class::Relationship::Base) \
perl(DBIx::Class::ResultClass::HashRefInflator) \
perl(DBIx::Class::ResultSet) \
perl(DBIx::Class::ResultSet::Pager) \
perl(DBIx::Class::ResultSetColumn) \
perl(DBIx::Class::ResultSetManager) \
perl(DBIx::Class::ResultSource) \
perl(DBIx::Class::ResultSource::Table) \
perl(DBIx::Class::ResultSource::View) \
perl(DBIx::Class::ResultSourceHandle) \
perl(DBIx::Class::ResultSourceProxy::Table) \
perl(DBIx::Class::Row) \
perl(DBIx::Class::SQLMaker) \
perl(DBIx::Class::SQLMaker::ClassicExtensions) \
perl(DBIx::Class::SQLMaker::LimitDialects) \
perl(DBIx::Class::SQLMaker::OracleJoins) \
perl(DBIx::Class::Schema) \
perl(DBIx::Class::Schema::Versioned) \
perl(DBIx::Class::Serialize::Storable) \
perl(DBIx::Class::StartupCheck) \
perl(DBIx::Class::Storage) \
perl(DBIx::Class::Storage::DBI) \
perl(DBIx::Class::Storage::DBI::ACCESS) \
perl(DBIx::Class::Storage::DBI::ADO) \
perl(DBIx::Class::Storage::DBI::ADO::MS_Jet) \
perl(DBIx::Class::Storage::DBI::ADO::MS_Jet::Cursor) \
perl(DBIx::Class::Storage::DBI::ADO::Microsoft_SQL_Server) \
perl(DBIx::Class::Storage::DBI::ADO::Microsoft_SQL_Server::Cursor) \
perl(DBIx::Class::Storage::DBI::AutoCast) \
perl(DBIx::Class::Storage::DBI::Cursor) \
perl(DBIx::Class::Storage::DBI::DB2) \
perl(DBIx::Class::Storage::DBI::Firebird) \
perl(DBIx::Class::Storage::DBI::Firebird::Common) \
perl(DBIx::Class::Storage::DBI::IdentityInsert) \
perl(DBIx::Class::Storage::DBI::Informix) \
perl(DBIx::Class::Storage::DBI::InterBase) \
perl(DBIx::Class::Storage::DBI::MSSQL) \
perl(DBIx::Class::Storage::DBI::NoBindVars) \
perl(DBIx::Class::Storage::DBI::ODBC) \
perl(DBIx::Class::Storage::DBI::ODBC::ACCESS) \
perl(DBIx::Class::Storage::DBI::ODBC::DB2_400_SQL) \
perl(DBIx::Class::Storage::DBI::ODBC::Firebird) \
perl(DBIx::Class::Storage::DBI::ODBC::Microsoft_SQL_Server) \
perl(DBIx::Class::Storage::DBI::ODBC::SQL_Anywhere) \
perl(DBIx::Class::Storage::DBI::Oracle) \
perl(DBIx::Class::Storage::DBI::Oracle::Generic) \
perl(DBIx::Class::Storage::DBI::Oracle::WhereJoins) \
perl(DBIx::Class::Storage::DBI::Pg) \
perl(DBIx::Class::Storage::DBI::Replicated) \
perl(DBIx::Class::Storage::DBI::Replicated::Balancer) \
perl(DBIx::Class::Storage::DBI::Replicated::Balancer::First) \
perl(DBIx::Class::Storage::DBI::Replicated::Balancer::Random) \
perl(DBIx::Class::Storage::DBI::Replicated::Pool) \
perl(DBIx::Class::Storage::DBI::Replicated::Replicant) \
perl(DBIx::Class::Storage::DBI::Replicated::WithDSN) \
perl(DBIx::Class::Storage::DBI::SQLAnywhere) \
perl(DBIx::Class::Storage::DBI::SQLAnywhere::Cursor) \
perl(DBIx::Class::Storage::DBI::SQLite) \
perl(DBIx::Class::Storage::DBI::Sybase) \
perl(DBIx::Class::Storage::DBI::Sybase::ASE) \
perl(DBIx::Class::Storage::DBI::Sybase::ASE::NoBindVars) \
perl(DBIx::Class::Storage::DBI::Sybase::FreeTDS) \
perl(DBIx::Class::Storage::DBI::Sybase::MSSQL) \
perl(DBIx::Class::Storage::DBI::Sybase::Microsoft_SQL_Server) \
perl(DBIx::Class::Storage::DBI::Sybase::Microsoft_SQL_Server::NoBindVars) \
perl(DBIx::Class::Storage::DBI::UniqueIdentifier) \
perl(DBIx::Class::Storage::DBI::mysql) \
perl(DBIx::Class::Storage::Debug::PrettyTrace) \
perl(DBIx::Class::Storage::Statistics) \
perl(DBIx::Class::Storage::TxnScopeGuard) \
perl(DBIx::Class::UTF8Columns) \
perl(SQL::Translator::Parser::DBIx::Class) \
perl(SQL::Translator::Producer::DBIx::Class::File) \
perl-DBIx-Class"
RDEPENDS:${PN} += "/usr/bin/env \
perl(:MODULE_COMPAT_5.36.0) \
perl(Class::Accessor::Grouped) \
perl(Class::C3::Componentised) \
perl(Class::Inspector) \
perl(Config::Any) \
perl(Context::Preserve) \
perl(DBI) \
perl(Data::Dumper::Concise) \
perl(Devel::GlobalDestruction) \
perl(Hash::Merge) \
perl(MRO::Compat) \
perl(Module::Find) \
perl(Moo) \
perl(Path::Class) \
perl(SQL::Abstract::Classic) \
perl(Scope::Guard) \
perl(Sub::Name) \
perl(Text::Balanced) \
perl(Try::Tiny) \
perl(namespace::clean)"

inherit rpm
