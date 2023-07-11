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

RPM_NAME = "python310-sparse-0.14.0-2.1.noarch.rpm"
RPM_HASH = "7ba3378f42c95c968579bafb72b5f09d9716da567ff17207a05ddcd8d071ee1e02559dbe1310ec05103fea703695b0006e4d8078e3fbcac75452c128d2a2fd8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sparse \
python310-sparse \
python3dist-sparse"

RDEPENDS:${PN} += "python-abi \
python310-numba \
python310-numpy \
python310-scipy"

inherit rpm
