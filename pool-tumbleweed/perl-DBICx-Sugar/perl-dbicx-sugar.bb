SUMMARY = "Just some syntax sugar for DBIx::Class"
DESCRIPTION = "Just some syntax sugar for your DBIx::Class applications. This was \
originally created to remove code duplication between Dancer::Plugin::DBIC \
and Dancer2::Plugin::DBIC."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.0200"

RPM_NAME = "perl-DBICx-Sugar-0.0200-1.13.noarch.rpm"
RPM_HASH = "f0d24df9850de98fe2edbff10c5207bafa8a9053f9d5cd4ce4e92723057f6b5e7b339f027fdd097648899b0f431aa8c9349f92a9ee066abfb1e0b757c4deeeac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DBICx--Sugar \
perl-DBICx-Sugar"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-DBIx--Class \
perl-Module--Load \
perl-SQL--Translator \
perl-YAML"

inherit rpm
