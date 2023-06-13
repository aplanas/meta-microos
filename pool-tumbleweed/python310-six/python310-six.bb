SUMMARY = "Python 2 and 3 compatibility utilities"
DESCRIPTION = "Six is a Python 2 and 3 compatibility library. It provides utility \
functions for smoothing over the differences between the Python \
versions with the goal of writing Python code that is compatible on \
both Python versions. See the documentation for more information on \
what is provided."
LICENSE = "MIT"

PV = "1.16.0"

RPM_NAME = "python310-six-1.16.0-3.1.noarch.rpm"
RPM_HASH = "f9a495f5d704689e9956ddfdce4ca6ea95cd034ab376867578b68a36593e5a32b6061f395a2047803d20f6a7ff5a557a46876bfba59602314b57a377be8ea9cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-six \
python3.10dist(six) \
python310-six \
python3dist(six)"

RDEPENDS:${PN} += "/bin/sh \
python(abi)"

inherit rpm
