SUMMARY = "Database independent interface for Perl"
DESCRIPTION = "The DBI is a database access module for the Perl programming language. It \
defines a set of methods, variables, and conventions that provide a \
consistent database interface, independent of the actual database being \
used. \
 \
It is important to remember that the DBI is just an interface. The DBI is a \
layer of 'glue' between an application and one or more database _driver_ \
modules. It is the driver modules which do most of the real work. The DBI \
provides a standard interface and framework for the drivers to operate \
within. \
 \
This document often uses terms like _references_, _objects_, _methods_. If \
you're not familiar with those terms then it would be a good idea to read \
at least the following perl manuals first: perlreftut, perldsc, perllol, \
and perlboot."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.643"

RPM_NAME = "perl-DBI-1.643-2.15.aarch64.rpm"
RPM_HASH = "4769adb40a28645dfd902f963a565a60f7c4d09999635fb114c54974cb1f8685b005a75c072964164050359715b03d862f9e37c76fcae6c188ffee9f8e59c663"

RPROVIDES:${PN} += "perl(Bundle::DBI) \
perl(DBD::DBM) \
perl(DBD::DBM::Statement) \
perl(DBD::DBM::Table) \
perl(DBD::DBM::db) \
perl(DBD::DBM::dr) \
perl(DBD::DBM::st) \
perl(DBD::ExampleP) \
perl(DBD::File) \
perl(DBD::File::DataSource::File) \
perl(DBD::File::DataSource::Stream) \
perl(DBD::File::Statement) \
perl(DBD::File::Table) \
perl(DBD::File::TableSource::FileSystem) \
perl(DBD::File::db) \
perl(DBD::File::dr) \
perl(DBD::File::st) \
perl(DBD::Gofer) \
perl(DBD::Gofer::Policy::Base) \
perl(DBD::Gofer::Policy::classic) \
perl(DBD::Gofer::Policy::pedantic) \
perl(DBD::Gofer::Policy::rush) \
perl(DBD::Gofer::Transport::Base) \
perl(DBD::Gofer::Transport::corostream) \
perl(DBD::Gofer::Transport::null) \
perl(DBD::Gofer::Transport::pipeone) \
perl(DBD::Gofer::Transport::stream) \
perl(DBD::Mem) \
perl(DBD::Mem::DataSource) \
perl(DBD::Mem::Statement) \
perl(DBD::Mem::Table) \
perl(DBD::Mem::db) \
perl(DBD::Mem::dr) \
perl(DBD::Mem::st) \
perl(DBD::NullP) \
perl(DBD::Proxy) \
perl(DBD::Proxy::db) \
perl(DBD::Proxy::dr) \
perl(DBD::Proxy::st) \
perl(DBD::Sponge) \
perl(DBDI) \
perl(DBI) \
perl(DBI::Const::GetInfo::ANSI) \
perl(DBI::Const::GetInfo::ODBC) \
perl(DBI::Const::GetInfoReturn) \
perl(DBI::Const::GetInfoType) \
perl(DBI::DBD) \
perl(DBI::DBD::Metadata) \
perl(DBI::DBD::SqlEngine) \
perl(DBI::DBD::SqlEngine::DataSource) \
perl(DBI::DBD::SqlEngine::Statement) \
perl(DBI::DBD::SqlEngine::Table) \
perl(DBI::DBD::SqlEngine::TableSource) \
perl(DBI::DBD::SqlEngine::TieMeta) \
perl(DBI::DBD::SqlEngine::TieTables) \
perl(DBI::DBD::SqlEngine::db) \
perl(DBI::DBD::SqlEngine::dr) \
perl(DBI::DBD::SqlEngine::st) \
perl(DBI::Gofer::Execute) \
perl(DBI::Gofer::Request) \
perl(DBI::Gofer::Response) \
perl(DBI::Gofer::Serializer::Base) \
perl(DBI::Gofer::Serializer::DataDumper) \
perl(DBI::Gofer::Serializer::Storable) \
perl(DBI::Gofer::Transport::Base) \
perl(DBI::Gofer::Transport::pipeone) \
perl(DBI::Gofer::Transport::stream) \
perl(DBI::Profile) \
perl(DBI::ProfileData) \
perl(DBI::ProfileDumper) \
perl(DBI::ProfileDumper::Apache) \
perl(DBI::ProfileSubs) \
perl(DBI::ProxyServer) \
perl(DBI::ProxyServer::db) \
perl(DBI::ProxyServer::dr) \
perl(DBI::ProxyServer::st) \
perl(DBI::SQL::Nano) \
perl(DBI::SQL::Nano::Statement_) \
perl(DBI::SQL::Nano::Table_) \
perl(DBI::Util::CacheMemory) \
perl(DBI::Util::_accessor) \
perl(DBI::common) \
perl-DBI \
perl-DBI(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
