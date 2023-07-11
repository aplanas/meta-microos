SUMMARY = "Text::German Perl module"
DESCRIPTION = "Text::German Perl module"
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.06"

RPM_NAME = "perl-Text-German-0.06-1.28.noarch.rpm"
RPM_HASH = "e96a50ff83140a725403b8317e57a0604e7a9d97ad7bc3d7472d6eef4cbeea17dd12ed6afc5c2f3e0e44280c47360d37a395b021dfc7e47873de25bedfde5ead"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--German \
perl-Text--German--Adjektiv \
perl-Text--German--Ausnahme \
perl-Text--German--Cache \
perl-Text--German--Endung \
perl-Text--German--Regel \
perl-Text--German--Util \
perl-Text--German--Verb \
perl-Text--German--Vorsilbe \
perl-Text-German"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
