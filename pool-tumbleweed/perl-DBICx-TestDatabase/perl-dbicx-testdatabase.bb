SUMMARY = "Create a Temporary Database From a Dbix::Class::Schema"
DESCRIPTION = "This module creates a temporary SQLite database, deploys your DBIC schema, \
and then connects to it. This lets you easily test your DBIC schema. Since \
you have a fresh database for every test, you don't have to worry about \
cleaning up after your tests, ordering of tests affecting failure, etc."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.05"

RPM_NAME = "perl-DBICx-TestDatabase-0.05-2.20.noarch.rpm"
RPM_HASH = "3d667d13b08c66659b3459a78685604c4c3994f0e4638e5957f0f9835844b0804caf0381e99c27c34c969334611501d6212f98917aecdb343a1db44b256816c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DBICx--TestDatabase \
perl-DBICx--TestDatabase--Subclass \
perl-DBICx-TestDatabase"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-DBD--SQLite \
perl-SQL--Translator"

inherit rpm
