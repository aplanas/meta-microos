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

PV = "0.4.12"

RPM_NAME = "python310-scikit-sparse-0.4.12-1.1.aarch64.rpm"
RPM_HASH = "9a79e39cf14ff535b0a1c438fb17987a6ba78c3909d0aeb192c429d9dcc69211a08b00063647dca1debfc113e5917afffe542cdee8b3be0f0d8708e5a9c5b943"

RPROVIDES:${PN} += "python3.10dist-scikit-sparse \
python310-scikit-sparse \
python3dist-scikit-sparse"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcholmod.so.3 \
python-abi \
python310-numpy \
python310-scipy"

inherit rpm
