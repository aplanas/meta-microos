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

RPM_NAME = "python310-scikit-sparse-0.4.5-1.14.aarch64.rpm"
RPM_HASH = "9b0388d6206026a19f3528c609405d34264fb6116a55f68cdd8e5f35c7d1aacc1e0967d899dd426b54974791292455c2d0941c2bda08f24085184909d408b688"

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
