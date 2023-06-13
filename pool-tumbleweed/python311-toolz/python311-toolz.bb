SUMMARY = "List processing tools and functional utilities for python"
DESCRIPTION = "A set of python utility functions for iterators, functions, and dictionaries."
LICENSE = "BSD-3-Clause"

PV = "0.12.0"

RPM_NAME = "python311-toolz-0.12.0-1.5.noarch.rpm"
RPM_HASH = "a08e770efdc5c71da5e0c4f922aa509e2698d650f03480b1a53ce052a418b2dede16e514ef40cc35f3184f352eb3db471e5b76bc64572e7a206828506d118fbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(toolz) \
python311-toolz \
python3dist(toolz)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
