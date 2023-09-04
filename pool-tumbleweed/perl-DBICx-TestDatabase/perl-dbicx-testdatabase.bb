SUMMARY = "Create a Temporary Database From a Dbix::Class::Schema"
DESCRIPTION = "This module creates a temporary SQLite database, deploys your DBIC schema, \
and then connects to it. This lets you easily test your DBIC schema. Since \
you have a fresh database for every test, you don't have to worry about \
cleaning up after your tests, ordering of tests affecting failure, etc."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.05"

RPM_NAME = "perl-DBICx-TestDatabase-0.05-2.21.noarch.rpm"
RPM_HASH = "52c32a896d0ea18d4f0a6019e0101244c95e56d736481a17e921d2e0693dfa404889ac552bbc536798f671b9a9f3d177fedabb7c8d011b468164c2d79da4f807"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DBICx--TestDatabase \
perl-DBICx--TestDatabase--Subclass \
perl-DBICx-TestDatabase"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-DBD--SQLite \
perl-SQL--Translator"

inherit rpm
