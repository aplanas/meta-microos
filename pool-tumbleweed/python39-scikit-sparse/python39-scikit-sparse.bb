SUMMARY = "Scikits sparse matrix package"
DESCRIPTION = "Sparse matrix tools. \
 \
This is a sparse matrix code in Python that plays well with \
scipy.sparse, but that is somehow unsuitable for inclusion in scipy \
proper. \
 \
There is a wrapper for the CHOLMOD library for sparse Cholesky \
decomposition."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.4.5"

RPM_NAME = "python39-scikit-sparse-0.4.5-1.14.aarch64.rpm"
RPM_HASH = "13576884e5c4b8a83b69e519dc1dae2dbd6d6febae0c9075cd3793a60c2604a010305eeeebdb5c84aede9ff8fad9cf1eb6adfaf0a4231ddf72d936312259ab59"

RPROVIDES:${PN} += "python3.9dist-scikit-sparse \
python39-scikit-sparse \
python3dist-scikit-sparse"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcholmod.so.3 \
python-abi \
python39-numpy \
python39-scipy"

inherit rpm
