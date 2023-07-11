SUMMARY = "Library of C++ templates implementing universal Clifford algebras"
DESCRIPTION = "GluCat is a library of template classes which model the universal \
Clifford algebras over the field of real numbers, with arbitrary \
dimension and arbitrary signature. GluCat implements a model of each \
Clifford algebra corresponding to each non-degenerate quadratic form \
up to a maximum number of dimensions."
LICENSE = "LGPL-3.0-only"

PV = "0.12.0"

RPM_NAME = "python39-glucat-0.12.0-3.6.aarch64.rpm"
RPM_HASH = "93e273047e4fba5496e7bd1047eb31915c9ce4fbcb1a21f75fb7a0c0ba800e0652b1320f8af78d934ccbeaf38b3b18ef75e0fd160bb003e859df3910deab67b8"

RPROVIDES:${PN} += "python39-glucat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
