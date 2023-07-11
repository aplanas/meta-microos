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

RPM_NAME = "python39-munkres-1.1.4-4.3.noarch.rpm"
RPM_HASH = "d05fd6cfd59ec7a4b0267624f2e135aba4a942ead820a00084566c00f74e055147b9c7be6ca3818c3286e95c8888d859ab8960486fabfaf2754fd407399e4c3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-munkres \
python39-munkres \
python3dist-munkres"

RDEPENDS:${PN} += "python-abi"

inherit rpm
