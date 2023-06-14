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

RPM_NAME = "python311-munkres-1.1.4-4.1.noarch.rpm"
RPM_HASH = "e2748799c46efde7de0d0e1c70464a544244fa4d243b7cd5df83ef94b093aa78b81baa752ae390312516c117805f721b99191db10cf5923ae441b4d17bfd9242"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-munkres \
python311-munkres \
python3dist-munkres"

RDEPENDS:${PN} += "python-abi"

inherit rpm
