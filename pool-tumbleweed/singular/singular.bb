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

RPROVIDES:${PN} += "application() \
application(Singular.desktop) \
singular \
singular(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSingular-4.3.1.p3.so()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfactory-4.3.1.p3.so()(64bit) \
libgmp.so.10()(64bit) \
libomalloc-4.3.1.p3.so()(64bit) \
libpolys-4.3.1.p3.so()(64bit) \
libsingular_resources-4.3.1.p3.so()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
