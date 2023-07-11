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

RPM_NAME = "perl-Math-BigInt-GMP-1.6012-1.2.aarch64.rpm"
RPM_HASH = "4a700e7e45b0463bc8f13084dcfdf6c85a0dd6b928495f5eb6e00812b75af136eae7daafdfc55a5317f11c60e93b30bddca7fb4e7611e907c236d4435f6a55ac"

RPROVIDES:${PN} += "perl-Math--BigInt--GMP \
perl-Math-BigInt-GMP"

RDEPENDS:${PN} += "libc.so.6 \
libgmp.so.10 \
perl--MODULE-COMPAT-5.36.1 \
perl-Carp \
perl-Math--BigInt"

inherit rpm
