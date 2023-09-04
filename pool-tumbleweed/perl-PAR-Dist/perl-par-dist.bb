SUMMARY = "Create and manipulate PAR distributions"
DESCRIPTION = "This module creates and manipulates _PAR distributions_. They are \
architecture-specific *PAR* files, containing everything under _blib/_ of \
CPAN distributions after their 'make' or 'Build' stage, a _META.yml_ \
describing metadata of the original CPAN distribution, and a _MANIFEST_ \
detailing all files within it. Digitally signed PAR distributions will also \
contain a _SIGNATURE_ file. \
 \
The naming convention for such distributions is: \
 \
    $NAME-$VERSION-$ARCH-$PERL_VERSION.par \
 \
For example, 'PAR-Dist-0.01-i386-freebsd-5.8.0.par' corresponds to the 0.01 \
release of 'PAR-Dist' on CPAN, built for perl 5.8.0 running on \
'i386-freebsd'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.52"

RPM_NAME = "perl-PAR-Dist-0.52-1.3.noarch.rpm"
RPM_HASH = "2faf512b0b24fe487f2171c1409a2896e973c1a08a2c6aa129a7c8d4c5407c1329c67946fb0de01f7d7017be036f919bfc438d5a1d7d581a8d33e7ba27b45035"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-PAR--Dist \
perl-PAR-Dist"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
