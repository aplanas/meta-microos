SUMMARY = "Just some syntax sugar for DBIx::Class"
DESCRIPTION = "Just some syntax sugar for your DBIx::Class applications. This was \
originally created to remove code duplication between Dancer::Plugin::DBIC \
and Dancer2::Plugin::DBIC."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.0200"

RPM_NAME = "perl-DBICx-Sugar-0.0200-1.12.noarch.rpm"
RPM_HASH = "8f1b85ffb9a38a24863136643914436abd973f33eca00997b0bb223eb4eb564bd2f89fd8ebadf1fd8fe4c37f0125770398b1e49a333ba00dac741b677e6d76a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DBICx--Sugar \
perl-DBICx-Sugar"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-DBIx--Class \
perl-Module--Load \
perl-SQL--Translator \
perl-YAML"

inherit rpm
