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

RPM_NAME = "python39-sparse-0.14.0-2.1.noarch.rpm"
RPM_HASH = "7a79c5d64e01ac2946d043f249d923aa654393478a32a51a4380b8a5a65f4f81a8b0ab02348ca6948c21fd12087973b3ffbcb57556c2a7337351ce90d6c7f1d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sparse \
python39-sparse \
python3dist-sparse"

RDEPENDS:${PN} += "python-abi \
python39-numba \
python39-numpy \
python39-scipy"

inherit rpm
