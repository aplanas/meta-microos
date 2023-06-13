SUMMARY = "Promises/A+ implementation for Python"
DESCRIPTION = "This is an implementation of Promises in Python"
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python39-promise-2.3.0-3.3.noarch.rpm"
RPM_HASH = "23e79ced7301691067d21dac4da60d470f9c42d1bfe917556b0c1b4f8d20c44af7d814b2783bbc8d2d8657f0efa2ce3f51329b9cc5db9183dfb3259c5cde2dbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(promise) \
python39-promise \
python3dist(promise)"

RDEPENDS:${PN} += "python(abi) \
python39-six"

inherit rpm
