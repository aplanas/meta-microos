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

RPM_NAME = "openspecfun-devel-0.5.5-1.3.aarch64.rpm"
RPM_HASH = "113c07a35e2042338133e18358fe5f0d0b9add4e533f22c14fa29d959e775723cac6814d32c484ee23d632c4231f1b5b8874656042329a005f37abbd6d92635f"

RPROVIDES:${PN} += "openspecfun-devel \
openspecfun-devel(aarch-64)"

RDEPENDS:${PN} += "libopenspecfun1"

inherit rpm
