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

RPM_NAME = "perl-PAR-Dist-0.52-1.2.noarch.rpm"
RPM_HASH = "646c70dda4ce218130316cc605a8c48c2ada25483035f212def9aee60b7b48942d71d9a95edc7edd4e2ddc764896c4ce7d648665c6a458f3eb24bd0c8256251d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-PAR--Dist \
perl-PAR-Dist"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
