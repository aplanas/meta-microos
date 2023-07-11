SUMMARY = "General Gaussian-type orbitals integrals for quantum chemistry"
DESCRIPTION = "libcint is an open source library for analytical Gaussian integrals. \
It provides C/Fortran API to evaluate one-electron / two-electron \
integrals for Cartesian / real-spherical / spinor Gaussian type functions."
LICENSE = "BSD-2-Clause"

PV = "4.4.1"

RPM_NAME = "libcint4-4.4.1-1.10.aarch64.rpm"
RPM_HASH = "d290827552420495788af66c6393d2331eacf2e9e270f4202bf842a702c607daefe323351c1e2147002613d0b11d344cccd29fdc9fbce8bacbb64eeb196c664a"

RPROVIDES:${PN} += "libcint.so.4 \
libcint4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libopenblas.so.0"

inherit rpm
