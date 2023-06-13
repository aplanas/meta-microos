SUMMARY = "Library of C++ templates implementing universal Clifford algebras"
DESCRIPTION = "GluCat is a library of template classes which model the universal \
Clifford algebras over the field of real numbers, with arbitrary \
dimension and arbitrary signature. GluCat implements a model of each \
Clifford algebra corresponding to each non-degenerate quadratic form \
up to a maximum number of dimensions."
LICENSE = "LGPL-3.0-only"

PV = "0.12.0"

RPM_NAME = "python310-glucat-0.12.0-3.4.aarch64.rpm"
RPM_HASH = "a52b0ac89d5712203caa5fcde46c66a924c93143a7d54217bb91e320423ac1ddb590c29c2b073cea8f2b47216fc8f2baf90540fe4f42af426bca45b8e5c9e345"

RPROVIDES:${PN} += "python3-glucat \
python310-glucat \
python310-glucat(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
python(abi)"

inherit rpm
