SUMMARY = "Helper for Dealing with Pg During Tests"
DESCRIPTION = "Test::Mojo::Pg makes the creation and removal of a transitory database \
during testing when using Mojo::Pg. This is useful when every test should \
work from a 'clean' database."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.33"

RPM_NAME = "perl-Test-Mojo-Pg-0.33-1.24.noarch.rpm"
RPM_HASH = "19570495751bfed83845298bb2d5fa2059cee499b996d9674a65a30286de633b3a514fa169b34bfb847253d89f7cbed3f7b2e884edd8783a8ea68c5029a65f82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Mojo--Pg \
perl-Test-Mojo-Pg"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Mojo--Base \
perl-Mojo--Pg"

inherit rpm
