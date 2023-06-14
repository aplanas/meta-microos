SUMMARY = "Singular CAS"
DESCRIPTION = "Singular is a computer algebra system for polynomial computations, \
with special emphasis on commutative and non-commutative algebra, \
algebraic geometry, and singularity theory. \
 \
Its main computational objects are ideals, modules and matrices over \
a large number of baserings. These include \
 \
* polynomial rings over various ground fields and some rings \
  (including the integers), \
* localizations of the above, \
* a general class of non-commutative algebras (including the exterior \
  algebra and the Weyl algebra), \
* quotient rings of the above, \
* tensor products of the above. \
 \
Singular's core algorithms handle \
 \
* Gröbner resp. standard bases and free resolutions, \
* polynomial factorization, \
* resultants, characteristic sets, and numerical root finding."
LICENSE = "BSD-3-Clause & GPL-2.0-only & GPL-3.0-only & LGPL-2.1-only"

PV = "4.3.1.p3"

RPM_NAME = "singular-4.3.1.p3-1.3.aarch64.rpm"
RPM_HASH = "843c82257928776a3e80ff87c7021d9ffa9296a85ab1f0244d26692725ff1e33e33a856dc4ca936cd9d9dde447f13ea6522a23d7722a8376f384645e79bd8233"

RPROVIDES:${PN} += "singular"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
ld-linux-aarch64.so.1 \
libSingular-4.3.1.p3.so \
libc.so.6 \
libfactory-4.3.1.p3.so \
libgmp.so.10 \
libomalloc-4.3.1.p3.so \
libpolys-4.3.1.p3.so \
libsingular-resources-4.3.1.p3.so \
libstdc++.so.6"

inherit rpm
