SUMMARY = "Configurable talking cow (and some other creatures)"
DESCRIPTION = "cowsay is a configurable talking cow, written in Perl. It operates \
much as the figlet program does, and it written in the same spirit \
of silliness."
LICENSE = "GPL-3.0-or-later"

PV = "3.7.0"

RPM_NAME = "cowsay-3.7.0-1.9.noarch.rpm"
RPM_HASH = "d8d83c28fe33b81e923cc01e1d2d577ab5a7c4b61780e116b9c3d456535ec333d1ff5c44c0b09abca049cdc4d0d11fa6908bce3cee7428dc080acea694371aa7"
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
perl--MODULE-COMPAT-5.38.0"

inherit rpm
