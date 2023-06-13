SUMMARY = "Create a Temporary Database From a Dbix::Class::Schema"
DESCRIPTION = "This module creates a temporary SQLite database, deploys your DBIC schema, \
and then connects to it. This lets you easily test your DBIC schema. Since \
you have a fresh database for every test, you don't have to worry about \
cleaning up after your tests, ordering of tests affecting failure, etc."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.05"

RPM_NAME = "perl-DBICx-TestDatabase-0.05-2.19.noarch.rpm"
RPM_HASH = "de4f41ebf6582e44e19a2ec313096e9968fb02da76d58427e0dda72f33c12ed83aad38971261fc04c219bcf48a021e0874a894c9539ca68972758b73256fd092"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(DBICx::TestDatabase) \
perl(DBICx::TestDatabase::Subclass) \
perl-DBICx-TestDatabase"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(DBD::SQLite) \
perl(SQL::Translator)"

inherit rpm
