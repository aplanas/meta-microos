SUMMARY = "Library of C++ templates implementing universal Clifford algebras"
DESCRIPTION = "GluCat is a library of template classes which model the universal \
Clifford algebras over the field of real numbers, with arbitrary \
dimension and arbitrary signature. GluCat implements a model of each \
Clifford algebra corresponding to each non-degenerate quadratic form \
up to a maximum number of dimensions."
LICENSE = "LGPL-3.0-only"

PV = "0.12.0"

RPM_NAME = "python311-glucat-0.12.0-3.4.aarch64.rpm"
RPM_HASH = "cadafe424b733757dc1ec30292e42688284c6711ef1f40acb4f79dd8dd4eafd0b0c4743c94586c3ac8d9291284db20db894285f708d8e6baafc487b9afff636a"

RPROVIDES:${PN} += "python311-glucat \
python311-glucat(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
python(abi)"

inherit rpm
