SUMMARY = "Python 2 and 3 compatibility utilities"
DESCRIPTION = "Six is a Python 2 and 3 compatibility library. It provides utility \
functions for smoothing over the differences between the Python \
versions with the goal of writing Python code that is compatible on \
both Python versions. See the documentation for more information on \
what is provided."
LICENSE = "MIT"

PV = "1.16.0"

RPM_NAME = "python310-six-1.16.0-3.3.noarch.rpm"
RPM_HASH = "e24a97c41e07fd4ee9ca48ea419c1bf651019d51daae9b52b25bf5f3142cb393506de62ca89f9fa237744f669ac209fea40528f12a951372de844db2948a34c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-six \
python310-six \
python3dist-six"

RDEPENDS:${PN} += "/usr/bin/sh \
python-abi"

inherit rpm
