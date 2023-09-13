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

RPM_NAME = "python311-scikit-sparse-0.4.12-1.1.aarch64.rpm"
RPM_HASH = "f6cd772d4728c2d556e943a11fa35704e775e7467c12a15a3a917dd9b040ad1cd6c7dea8e7001c291cf192c312b66af8724f8f839cc74643168f5d19d88ed432"

RPROVIDES:${PN} += "python3-scikit-sparse \
python3.11dist-scikit-sparse \
python311-scikit-sparse \
python3dist-scikit-sparse"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcholmod.so.3 \
python-abi \
python311-numpy \
python311-scipy"

inherit rpm
