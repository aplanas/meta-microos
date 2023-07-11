SUMMARY = "List processing tools and functional utilities for python"
DESCRIPTION = "A set of python utility functions for iterators, functions, and dictionaries."
LICENSE = "BSD-3-Clause"

PV = "0.12.0"

RPM_NAME = "python39-toolz-0.12.0-1.7.noarch.rpm"
RPM_HASH = "3c297b9891e16bf91f60bb2c10363d5e72964a1048093480fb3517b4845c0666c3c93580e491180e2a770ebba2ac5a9e96a0414fbbeede25ed295d13c1b87049"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-toolz \
python39-toolz \
python3dist-toolz"

RDEPENDS:${PN} += "python-abi"

inherit rpm
