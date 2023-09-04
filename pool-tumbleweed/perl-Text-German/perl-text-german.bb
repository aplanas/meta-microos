SUMMARY = "Text::German Perl module"
DESCRIPTION = "Text::German Perl module"
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.06"

RPM_NAME = "perl-Text-German-0.06-1.29.noarch.rpm"
RPM_HASH = "167cfe79b2ec6fbd677869e2bdb68e45389dd47b6ee80492d5b848bfbdaf59502574898c6854555c89926ae51e413add9a5860c86aa8bf33c7e44b93f6597d95"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
