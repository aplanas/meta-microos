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

RPM_NAME = "singular-4.3.1.p3-1.4.aarch64.rpm"
RPM_HASH = "092406fdd7a79a1970c564f439e7b322242cf7795e600d93c7671a56c5bd1cf423bcebcfa7951edfa0970ffcd669053dd740092218e2bf5743eb5bbbb8c2184b"

RPROVIDES:${PN} += "singular"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
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
