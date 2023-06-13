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

RPM_NAME = "python311-scikit-sparse-0.4.5-1.12.aarch64.rpm"
RPM_HASH = "097d3334925e927627b19594eed27aba334b4df7f85de7bde9bd4a0c04a36ab625d88d5809821b0ebb14713ba0cba445dde0a869c8223f916de6854dfd601abe"

RPROVIDES:${PN} += "python3.11dist(scikit-sparse) \
python311-scikit-sparse \
python311-scikit-sparse(aarch-64) \
python3dist(scikit-sparse)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcholmod.so.3()(64bit) \
python(abi) \
python311-numpy \
python311-scipy"

inherit rpm
