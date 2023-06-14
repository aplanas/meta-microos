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

RPM_NAME = "python39-munkres-1.1.4-4.1.noarch.rpm"
RPM_HASH = "edb3704091942b81d7652419a34b54e3e546a5865cb88d0c4ca8f090131d42f975daae060886dcf2bce3d6aece6b0a4cb37f87d2f7ade07f90ca7d4f2b9652c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-munkres \
python39-munkres \
python3dist-munkres"

RDEPENDS:${PN} += "python-abi"

inherit rpm
