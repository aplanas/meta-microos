SUMMARY = "Library of C++ templates implementing universal Clifford algebras"
DESCRIPTION = "GluCat is a library of template classes which model the universal \
Clifford algebras over the field of real numbers, with arbitrary \
dimension and arbitrary signature. GluCat implements a model of each \
Clifford algebra corresponding to each non-degenerate quadratic form \
up to a maximum number of dimensions."
LICENSE = "LGPL-3.0-only"

PV = "0.12.0"

RPM_NAME = "python310-glucat-0.12.0-3.6.aarch64.rpm"
RPM_HASH = "636646be72c06b72e7bac2d2728d7d6b2ddebbeb0c9b381a4efe5680f070ce9bdd56afda49400d1b9024a2a4753aad6ecf7a073a8e47454419c267af25338ab5"

RPROVIDES:${PN} += "python310-glucat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
