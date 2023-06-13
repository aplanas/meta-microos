SUMMARY = "Simple Database Abstraction"
DESCRIPTION = "Simple Database Abstraction"
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "3.0.17"

RPM_NAME = "perl-Class-DBI-3.0.17-5.27.noarch.rpm"
RPM_HASH = "e488b064668c023de48795d2440052e67b6a0cf0c580f044d7c02e32e535f915ca9800dde31de30bbb87c06de303772f63612c06c92bd11d62364d82b5703430"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Class::DBI) \
perl(Class::DBI::Attribute) \
perl(Class::DBI::Cascade::Delete) \
perl(Class::DBI::Cascade::Fail) \
perl(Class::DBI::Cascade::None) \
perl(Class::DBI::Column) \
perl(Class::DBI::ColumnGrouper) \
perl(Class::DBI::Iterator) \
perl(Class::DBI::Query) \
perl(Class::DBI::Query::Base) \
perl(Class::DBI::Relationship) \
perl(Class::DBI::Relationship::HasA) \
perl(Class::DBI::Relationship::HasMany) \
perl(Class::DBI::Relationship::MightHave) \
perl(Class::DBI::SQL::Transformer) \
perl(Class::DBI::Search::Basic) \
perl(Class::DBI::Test::SQLite) \
perl(Class::DBI::__::Base) \
perl-Class-DBI"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Class::Accessor) \
perl(Class::Data::Inheritable) \
perl(Class::Trigger) \
perl(Clone) \
perl(Ima::DBI) \
perl(UNIVERSAL::moniker) \
perl(version)"

inherit rpm
