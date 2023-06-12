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

RPM_NAME = "python310-sparse-0.14.0-1.2.noarch.rpm"
RPM_HASH = "b4859fc55bd79932f9f0325414a001fa2bf911c5a60cacaf4fe1263d558446bf07a413be8f9e320b4cbcf072d94d66df5cda41da2c119eaf004208ac71dc2a4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sparse \
python3.10dist(sparse) \
python310-sparse \
python3dist(sparse)"
RDEPENDS:${PN} += "python(abi) \
python310-numba \
python310-numpy \
python310-scipy"

inherit rpm
