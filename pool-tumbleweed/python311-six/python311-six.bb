SUMMARY = "Python 2 and 3 compatibility utilities"
DESCRIPTION = "Six is a Python 2 and 3 compatibility library. It provides utility \
functions for smoothing over the differences between the Python \
versions with the goal of writing Python code that is compatible on \
both Python versions. See the documentation for more information on \
what is provided."
LICENSE = "MIT"

PV = "1.16.0"

RPM_NAME = "python311-six-1.16.0-3.3.noarch.rpm"
RPM_HASH = "e44e267182a1e97896a242685906b48ff56f9a6f92f1603c1e4cd0db7b98bb62ab63c6eb1d941c5b8ffe4e29ba1cc1f43abfc4a005b2cf0446a50bc6291826ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-six \
python3.11dist-six \
python311-six \
python3dist-six"

RDEPENDS:${PN} += "/usr/bin/sh \
python-abi"

inherit rpm
