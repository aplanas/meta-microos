SUMMARY = "Sparse n-dimensional arrays for Python"
DESCRIPTION = "This module implements sparse multidimensional arrays on top of NumPy and \
Scipy.sparse. It generalizes the scipy.sparse.coo_matrix layout, but \
extends beyond just rows and columns to an arbitrary number of \
dimensions. \
 \
The original motivation is for machine learning algorithms, but it is \
intended for somewhat general use."
LICENSE = "BSD-3-Clause"

PV = "0.14.0"

RPM_NAME = "python311-sparse-0.14.0-2.1.noarch.rpm"
RPM_HASH = "feb6757b69e97ee177a101d0d9b7b575c43e5ed36b76dbbee96535164e70d93f440b822b8f55932d07c8db3bc566d2d9120b942e0c03891acbc792fefef2c986"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sparse \
python3.11dist-sparse \
python311-sparse \
python3dist-sparse"

RDEPENDS:${PN} += "python-abi \
python311-numba \
python311-numpy \
python311-scipy"

inherit rpm
