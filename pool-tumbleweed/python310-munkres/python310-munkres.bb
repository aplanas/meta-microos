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

RPM_NAME = "python310-munkres-1.1.4-4.3.noarch.rpm"
RPM_HASH = "c5b00fb238f77a45590f0ef2598f490af29fa6eb697a0c79f8f9d0416579ab3b5a16f93c909e08d517d63c75c56a3be0493787e6c151aea3d1b45aedb65c0ca8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-munkres \
python310-munkres \
python3dist-munkres"

RDEPENDS:${PN} += "python-abi"

inherit rpm
