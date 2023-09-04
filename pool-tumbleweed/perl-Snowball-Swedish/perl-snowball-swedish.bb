SUMMARY = "Porters stemming algorithm for swedish."
DESCRIPTION = "Porters stemming algorithm for swedish."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.2"

RPM_NAME = "perl-Snowball-Swedish-1.2-14.27.noarch.rpm"
RPM_HASH = "12728b6688f4fb0dc283304e602bc2879845592f18e69f6313e2f74b9d527653ae967555c8147047cf9b87559b33e89088444a33cc1681cb786a3b80bb6ff8a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Lingua--Stem--Snowball--Se \
perl-Snowball-Swedish"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
