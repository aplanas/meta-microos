SUMMARY = "Create a DBIx::Class::Schema based on a database"
DESCRIPTION = "DBIx::Class::Schema::Loader automates the definition of a \
DBIx::Class::Schema by scanning database table definitions and setting up \
the columns, primary keys, unique constraints and relationships. \
 \
See dbicdump for the 'dbicdump' utility. \
 \
DBIx::Class::Schema::Loader currently supports only the DBI storage type. \
It has explicit support for DBD::Pg, DBD::mysql, DBD::DB2, DBD::Firebird, \
DBD::InterBase, DBD::Informix, DBD::SQLAnywhere, DBD::SQLite, DBD::Sybase \
(for Sybase ASE and MSSSQL), DBD::ODBC (for MSSQL, MSAccess, Firebird and \
SQL Anywhere) DBD::ADO (for MSSQL and MSAccess) and DBD::Oracle. Other DBI \
drivers may function to a greater or lesser degree with this loader, \
depending on how much of the DBI spec they implement, and how standard \
their implementation is. \
 \
Patches to make other DBDs work correctly welcome. \
 \
See DBIx::Class::Schema::Loader::DBI::Writing for notes on writing your own \
vendor-specific subclass for an unsupported DBD driver. \
 \
This module requires DBIx::Class 0.08127 or later, and obsoletes the older \
DBIx::Class::Loader. \
 \
See DBIx::Class::Schema::Loader::Base for available options."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.07051"

RPM_NAME = "perl-DBIx-Class-Schema-Loader-0.07051-1.2.noarch.rpm"
RPM_HASH = "54ed6e9b18509d492ec34a0e4f2f5183e7118a73ddb529a9a41c46162f8e518dbda05c523c96c361bb07e03bb8b3be7c360e6f4affb98396a91a7cfecbec2826"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(DBIx::Class::Schema::Loader) \
perl(DBIx::Class::Schema::Loader::Base) \
perl(DBIx::Class::Schema::Loader::Column) \
perl(DBIx::Class::Schema::Loader::DBI) \
perl(DBIx::Class::Schema::Loader::DBI::ADO) \
perl(DBIx::Class::Schema::Loader::DBI::ADO::MS_Jet) \
perl(DBIx::Class::Schema::Loader::DBI::ADO::Microsoft_SQL_Server) \
perl(DBIx::Class::Schema::Loader::DBI::Component::QuotedDefault) \
perl(DBIx::Class::Schema::Loader::DBI::DB2) \
perl(DBIx::Class::Schema::Loader::DBI::Firebird) \
perl(DBIx::Class::Schema::Loader::DBI::Informix) \
perl(DBIx::Class::Schema::Loader::DBI::InterBase) \
perl(DBIx::Class::Schema::Loader::DBI::MSSQL) \
perl(DBIx::Class::Schema::Loader::DBI::ODBC) \
perl(DBIx::Class::Schema::Loader::DBI::ODBC::ACCESS) \
perl(DBIx::Class::Schema::Loader::DBI::ODBC::Firebird) \
perl(DBIx::Class::Schema::Loader::DBI::ODBC::Microsoft_SQL_Server) \
perl(DBIx::Class::Schema::Loader::DBI::ODBC::SQL_Anywhere) \
perl(DBIx::Class::Schema::Loader::DBI::Oracle) \
perl(DBIx::Class::Schema::Loader::DBI::Pg) \
perl(DBIx::Class::Schema::Loader::DBI::SQLAnywhere) \
perl(DBIx::Class::Schema::Loader::DBI::SQLite) \
perl(DBIx::Class::Schema::Loader::DBI::Sybase) \
perl(DBIx::Class::Schema::Loader::DBI::Sybase::Common) \
perl(DBIx::Class::Schema::Loader::DBI::Sybase::Microsoft_SQL_Server) \
perl(DBIx::Class::Schema::Loader::DBI::Writing) \
perl(DBIx::Class::Schema::Loader::DBI::mysql) \
perl(DBIx::Class::Schema::Loader::DBObject) \
perl(DBIx::Class::Schema::Loader::DBObject::Informix) \
perl(DBIx::Class::Schema::Loader::DBObject::Sybase) \
perl(DBIx::Class::Schema::Loader::Optional::Dependencies) \
perl(DBIx::Class::Schema::Loader::RelBuilder) \
perl(DBIx::Class::Schema::Loader::RelBuilder::Compat::v0_040) \
perl(DBIx::Class::Schema::Loader::RelBuilder::Compat::v0_05) \
perl(DBIx::Class::Schema::Loader::RelBuilder::Compat::v0_06) \
perl(DBIx::Class::Schema::Loader::RelBuilder::Compat::v0_07) \
perl(DBIx::Class::Schema::Loader::Table) \
perl(DBIx::Class::Schema::Loader::Table::Informix) \
perl(DBIx::Class::Schema::Loader::Table::Sybase) \
perl-DBIx-Class-Schema-Loader"
RDEPENDS:${PN} += "/usr/bin/perl \
perl(:MODULE_COMPAT_5.36.0) \
perl(Carp::Clan) \
perl(Class::Accessor::Grouped) \
perl(Class::C3::Componentised) \
perl(Class::Inspector) \
perl(Class::Unload) \
perl(DBIx::Class) \
perl(Data::Dump) \
perl(Exporter) \
perl(Hash::Merge) \
perl(Lingua::EN::Inflect::Number) \
perl(Lingua::EN::Inflect::Phrase) \
perl(Lingua::EN::Tagger) \
perl(List::Util) \
perl(MRO::Compat) \
perl(Scope::Guard) \
perl(String::CamelCase) \
perl(String::ToIdentifier::EN) \
perl(Sub::Util) \
perl(Try::Tiny) \
perl(curry) \
perl(namespace::clean)"

inherit rpm
