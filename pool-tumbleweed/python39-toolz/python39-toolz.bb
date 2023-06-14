SUMMARY = "List processing tools and functional utilities for python"
DESCRIPTION = "A set of python utility functions for iterators, functions, and dictionaries."
LICENSE = "BSD-3-Clause"

PV = "0.12.0"

RPM_NAME = "python39-toolz-0.12.0-1.5.noarch.rpm"
RPM_HASH = "7b0b77e60484f025103b6b13c74f5bfcd74a4eb5553902c1121d2544c13eec9524e2bbdcdc118afd0e45b6c9bf3ed65b9ae3aa8bbe8d250b313cf38bfe568eb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-toolz \
python39-toolz \
python3dist-toolz"

RDEPENDS:${PN} += "python-abi"

inherit rpm
