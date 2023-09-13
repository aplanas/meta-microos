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

RPM_NAME = "python39-scikit-sparse-0.4.12-1.1.aarch64.rpm"
RPM_HASH = "c77e7e5eefd065bb7f351205e3dc2d18cb7c335d837af540028e8675159340032c11d1a058fbdd1b6b26373659304de45ee264216ad4a44d541d5cf0645d2ad3"

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
