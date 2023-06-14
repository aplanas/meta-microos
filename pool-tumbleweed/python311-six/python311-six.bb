SUMMARY = "Python 2 and 3 compatibility utilities"
DESCRIPTION = "Six is a Python 2 and 3 compatibility library. It provides utility \
functions for smoothing over the differences between the Python \
versions with the goal of writing Python code that is compatible on \
both Python versions. See the documentation for more information on \
what is provided."
LICENSE = "MIT"

PV = "1.16.0"

RPM_NAME = "python311-six-1.16.0-3.1.noarch.rpm"
RPM_HASH = "9bd5c15e8b6c194ee80b0ccb33451a24c471919ec4ad277c97c5c6487712e491225a729c685e6deba1917a2995e1459dbbcae9197dffd3e6cbc90070420ad7c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-six \
python311-six \
python3dist-six"

RDEPENDS:${PN} += "/bin/sh \
python-abi"

inherit rpm
