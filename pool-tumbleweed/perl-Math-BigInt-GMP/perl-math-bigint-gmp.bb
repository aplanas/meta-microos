SUMMARY = "Backend library for Math::BigInt etc. based on GMP"
DESCRIPTION = "Math::BigInt::GMP is a replacement library for Math::BigInt::Calc that \
reimplements some of the Math::BigInt::Calc functions in XS. It can be used \
via: \
 \
    use Math::BigInt lib => 'GMP'; \
 \
This package contains a replacement (drop-in) module for Math::BigInt's core, \
Math::BigInt::Calc.pm."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.6012"

RPM_NAME = "perl-Math-BigInt-GMP-1.6012-1.3.aarch64.rpm"
RPM_HASH = "8b8e658db8a4aaababb2937f3cab74537bafd6ecf28303eed4584f596cf65582d4a1f2358b2c39d8d118bdf10187a7cd66c3efe80c21f73b24541bcadf14c61d"

RPROVIDES:${PN} += "perl-Math--BigInt--GMP \
perl-Math-BigInt-GMP"

RDEPENDS:${PN} += "libc.so.6 \
libgmp.so.10 \
perl--MODULE-COMPAT-5.38.0 \
perl-Carp \
perl-Math--BigInt"

inherit rpm
