SUMMARY = "Helper for Dealing with Pg During Tests"
DESCRIPTION = "Test::Mojo::Pg makes the creation and removal of a transitory database \
during testing when using Mojo::Pg. This is useful when every test should \
work from a 'clean' database."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.33"

RPM_NAME = "perl-Test-Mojo-Pg-0.33-1.23.noarch.rpm"
RPM_HASH = "506701393c4596039ea9f165d64a8ad14d364278bc8749eac6e6d0467c8e36bc336315d0d41b3fa9202945d82eef5f95c6b65ebb9c4d692ce7170f0eeafe10cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Mojo--Pg \
perl-Test-Mojo-Pg"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Mojo--Base \
perl-Mojo--Pg"

inherit rpm
