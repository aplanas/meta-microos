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

RPM_NAME = "python311-munkres-1.1.4-4.3.noarch.rpm"
RPM_HASH = "86576398ccf99363850df382a6f6c9030b4c41b60c98c69af37005a528e0833452a361f5081819fda83f3bb61dd82d74101add3810ba443cce63adaccdb8bccf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-munkres \
python3.11dist-munkres \
python311-munkres \
python3dist-munkres"

RDEPENDS:${PN} += "python-abi"

inherit rpm
