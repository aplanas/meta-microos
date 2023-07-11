SUMMARY = "Configurable talking cow (and some other creatures)"
DESCRIPTION = "cowsay is a configurable talking cow, written in Perl. It operates \
much as the figlet program does, and it written in the same spirit \
of silliness."
LICENSE = "GPL-3.0-or-later"

PV = "3.7.0"

RPM_NAME = "cowsay-3.7.0-1.8.noarch.rpm"
RPM_HASH = "8520b143459aceb83d5ce2038bf0fe091a5299f5113a4c73064ca798ee5f82e6266a68e3fd5b6751db3aac6662922866557f511aa33de751e09186b1a552c196"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cowsay \
perl-Acme--Cow--DragonAndCow \
perl-Acme--Cow--Example \
perl-Acme--Cow--Frogs \
perl-Acme--Cow--MechAndCow \
perl-Acme--Cow--Stegosaurus \
perl-Acme--Cow--TextBalloon \
perl-Acme--Cow--TuxStab"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
