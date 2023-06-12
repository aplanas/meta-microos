SUMMARY = "Development files for the MPFRCX arithmetic computation library"
DESCRIPTION = "MPFRCX is a library for the arithmetic of univariate polynomials over \
arbitrary precision real or complex numbers. \
 \
This subpackage provides the development headers for it."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6.3"

RPM_NAME = "mpfrcx-devel-0.6.3-1.6.aarch64.rpm"
RPM_HASH = "68ea0a08a1d28f32f915cad0c939b0263b560ccedeebb68a2353ea37f7ddb9120fc25137beed51748d632266ca822015dd5d4622e75ab3adf6372adddc8933d6"

RPROVIDES:${PN} += "mpfrcx-devel \
mpfrcx-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
gmp-devel \
libmpfrcx1 \
mpc-devel \
mpfr-devel"

inherit rpm
