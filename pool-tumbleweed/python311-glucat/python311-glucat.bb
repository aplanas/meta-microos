SUMMARY = "Library of C++ templates implementing universal Clifford algebras"
DESCRIPTION = "GluCat is a library of template classes which model the universal \
Clifford algebras over the field of real numbers, with arbitrary \
dimension and arbitrary signature. GluCat implements a model of each \
Clifford algebra corresponding to each non-degenerate quadratic form \
up to a maximum number of dimensions."
LICENSE = "LGPL-3.0-only"

PV = "0.12.0"

RPM_NAME = "python311-glucat-0.12.0-3.6.aarch64.rpm"
RPM_HASH = "54382cce5981507d9d32494f7e49b65d19606b8b920b5307506925351073ddc038272f9113a28d95655ba9db93255fe554b0e5cf9e04af74359e4d7239e952e6"

RPROVIDES:${PN} += "python3-glucat \
python311-glucat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
