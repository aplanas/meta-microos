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

RPM_NAME = "python310-scikit-sparse-0.4.5-1.12.aarch64.rpm"
RPM_HASH = "1842ea261941e7a15a46ee80d79ee0929c11404a06928c18e9a3b31b6b8ad75c4733a3eabe490fd642bfd20dfaa120703a3a33e27851aa9d25258cf1a5963762"

RPROVIDES:${PN} += "python3-scikit-sparse \
python3.10dist(scikit-sparse) \
python310-scikit-sparse \
python310-scikit-sparse(aarch-64) \
python3dist(scikit-sparse)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcholmod.so.3()(64bit) \
python(abi) \
python310-numpy \
python310-scipy"

inherit rpm
