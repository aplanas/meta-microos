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

RPM_NAME = "libopenspecfun1-0.5.5-1.4.aarch64.rpm"
RPM_HASH = "c3f616f405265746e7b11278a9154faf5f30a114d86eab35d9537710cb871860a136a0e7cb4076de340473cbb96bfc0c9fa09de095422833a115e67e43e3356a"

RPROVIDES:${PN} += "libopenspecfun.so.1 \
libopenspecfun1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6"

inherit rpm
