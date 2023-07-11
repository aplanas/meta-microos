SUMMARY = "Python 2 and 3 compatibility utilities"
DESCRIPTION = "Six is a Python 2 and 3 compatibility library. It provides utility \
functions for smoothing over the differences between the Python \
versions with the goal of writing Python code that is compatible on \
both Python versions. See the documentation for more information on \
what is provided."
LICENSE = "MIT"

PV = "1.16.0"

RPM_NAME = "python39-six-1.16.0-3.3.noarch.rpm"
RPM_HASH = "ee1d56c9753bd3cde9fa8f418b3b2205f7f48f9d123b17a002fdd12dea01cc7af83f30c8e5932df521bfbaf17676083366bbde6d254c0460fd9215a29b3eca3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-six \
python39-six \
python3dist-six"

RDEPENDS:${PN} += "/usr/bin/sh \
python-abi"

inherit rpm
