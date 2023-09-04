SUMMARY = "Simple .ini-file format"
DESCRIPTION = "simple .ini-file format"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.029"

RPM_NAME = "perl-Config-INI-0.029-1.3.noarch.rpm"
RPM_HASH = "5cdc6bb1fe03667300d912860151542b30a22a4a3baec170dbe0acb79373b0ef11483210abfe4b66d9bd7d18746dd4ec41ddfb4eba9a07599b8611d8e322bba9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Config--INI \
perl-Config--INI--Reader \
perl-Config--INI--Writer \
perl-Config-INI"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Mixin--Linewise--Readers \
perl-Mixin--Linewise--Writers"

inherit rpm
