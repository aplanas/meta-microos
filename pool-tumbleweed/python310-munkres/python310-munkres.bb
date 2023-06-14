SUMMARY = "Munkres implementation for Python"
DESCRIPTION = "The Munkres module provides an O(n^3) implementation of the Munkres \
algorithm (also called the Hungarian algorithm or the Kuhn-Munkres \
algorithm). The algorithm models an assignment problem as an NxM cost \
matrix, where each element represents the cost of assigning the i'th \
worker to the j'th job, and it figures out the least-cost solution, \
choosing a single item from each row and column in the matrix, such \
that no row and no column are used more than once. \
 \
This particular implementation is based on \
http://csclab.murraystate.edu/~bob.pilgrim/445/munkres.html."
LICENSE = "Apache-2.0"

PV = "1.1.4"

RPM_NAME = "python310-munkres-1.1.4-4.1.noarch.rpm"
RPM_HASH = "b1eb4a189037262eeba2da585e8d250c33e1e301e6f86395a3974e0152dceb15de75efd6f02cdc17c0c6583060f103850eed5e94254701b1e90556a639e09422"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-munkres \
python3.10dist-munkres \
python310-munkres \
python3dist-munkres"

RDEPENDS:${PN} += "python-abi"

inherit rpm
