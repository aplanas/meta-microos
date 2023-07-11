SUMMARY = "A collection of special mathematical functions"
DESCRIPTION = "Openspecfun provides AMOS and Faddeeva. AMOS (from Netlib) is a portable package \
for Bessel Functions of a Complex Argument and Nonnegative Order; it contains \
subroutines for computing Bessel functions and Airy functions. Faddeeva allows \
computing the various error functions of arbitrary complex arguments (Faddeeva \
function, error function, complementary error function, scaled complementary \
error function, imaginary error function, and Dawson function); given these, \
one can also easily compute Voigt functions, Fresnel integrals, and similar \
related functions as well."
LICENSE = "MIT"

PV = "0.5.5"

RPM_NAME = "openspecfun-devel-0.5.5-1.4.aarch64.rpm"
RPM_HASH = "0689c369ade4cc03c118e4fa5c9ac0ddbf74a14130811418774bd4052edc3ba3a149a6d19680c113bc1d5f7d0178769bfce6f966c2cff2a933fde0684e471bff"

RPROVIDES:${PN} += "openspecfun-devel"

RDEPENDS:${PN} += "libopenspecfun1"

inherit rpm
