SUMMARY = "A library for ARbitrary PRECision Computation"
DESCRIPTION = "ARPREC is a software package for performing arbitrary precision \
arithmetic. It consists of a revision and extension of Bailey's \
earlier MPFUN package, enhanced with special IEEE numerical \
techniques. \
 \
This package supports a flexible, arbitrarily high level of numeric \
precision -- the equivalent of hundreds or even thousands of decimal \
digits (up to approximately ten million digits if needed). Special \
routines are provided for extra-high precision (above 1000 digits). \
The entire library is written in C++. High-precision real, integer \
and complex datatypes are supported."
LICENSE = "BSD-3-Clause"

PV = "2.2.17"

RPM_NAME = "libarprec0-2.2.17-2.28.aarch64.rpm"
RPM_HASH = "0c10dc50682d90973c04161f20d3afc3af2ca3a09f16a78bb7ee9232a9a0eea9d82999555381e006367b84ae063fda12e7631bab5efd3a0ca2810b81ec01365f"

RPROVIDES:${PN} += "libarpec0 \
libarprec-f-main.so.0 \
libarprec.so.0 \
libarprec0 \
libarprecmod.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
