SUMMARY = "Arbitrary size integer math package"
DESCRIPTION = "Math::BigInt provides support for arbitrary precision integers. Overloading \
is also provided for Perl operators."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.999839"

RPM_NAME = "perl-Math-BigInt-1.999839-1.2.noarch.rpm"
RPM_HASH = "3aab2e17d631dd6415aece37d25f84a8ba61f5643e3e0d789f54326d7af690c2feb1321e030e054183405c43f69bb3986adda0d6e5532ebf84ef44203fc21f71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Math--BigFloat \
perl-Math--BigInt \
perl-Math--BigInt--Calc \
perl-Math--BigInt--Lib \
perl-Math-BigInt"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Carp \
perl-Math--Complex"

inherit rpm
