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

RPM_NAME = "perl-Math-BigInt-GMP-1.6012-1.1.aarch64.rpm"
RPM_HASH = "00a95c7290bb8d072af1ba7f6a990376cb5debd1703c3a66728bb4a4cdc4e4c22c96904d00312f932ae4d231bad50122e01d8713f4c4f537dd620b2573a52b58"

RPROVIDES:${PN} += "perl(Math::BigInt::GMP) \
perl-Math-BigInt-GMP \
perl-Math-BigInt-GMP(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
perl(:MODULE_COMPAT_5.36.0) \
perl(Carp) \
perl(Math::BigInt)"

inherit rpm
