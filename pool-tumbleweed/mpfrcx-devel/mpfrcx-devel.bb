SUMMARY = "Development files for the MPFRCX arithmetic computation library"
DESCRIPTION = "MPFRCX is a library for the arithmetic of univariate polynomials over \
arbitrary precision real or complex numbers. \
 \
This subpackage provides the development headers for it."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6.3"

RPM_NAME = "mpfrcx-devel-0.6.3-1.7.aarch64.rpm"
RPM_HASH = "13aabbe027d1ff167fba89c6166597e0f12da13278b81cb9662993e470708849fb16cc5651138aa637486856024f5d032fa883d2ae919222b23164248c373a65"

RPROVIDES:${PN} += "mpfrcx-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
gmp-devel \
libmpfrcx1 \
mpc-devel \
mpfr-devel"

inherit rpm
