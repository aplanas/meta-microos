SUMMARY = "Library of C++ templates implementing universal Clifford algebras"
DESCRIPTION = "GluCat is a library of template classes which model the universal \
Clifford algebras over the field of real numbers, with arbitrary \
dimension and arbitrary signature. GluCat implements a model of each \
Clifford algebra corresponding to each non-degenerate quadratic form \
up to a maximum number of dimensions."
LICENSE = "LGPL-3.0-only"

PV = "0.12.0"

RPM_NAME = "python39-glucat-0.12.0-3.4.aarch64.rpm"
RPM_HASH = "102672afa4e25e46f6161540d21256c76084cddf4068c10d700f5d9ee8b7533c82ddec770fdab3eef5075b8ba54303f81ad52100716d4baabfbaf8ef28c24b68"

RPROVIDES:${PN} += "python39-glucat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
