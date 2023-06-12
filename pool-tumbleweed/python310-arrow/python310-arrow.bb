SUMMARY = "Better dates and times for Python"
DESCRIPTION = "Arrow is a Python library that offers a sensible, human-friendly \
approach to creating, manipulating, formatting and converting dates, \
times, and timestamps.  It implements and updates the datetime type, \
plugging gaps in functionality, and provides an intelligent module \
API that supports many common creation scenarios.  Simply put, it \
helps you work with dates and times with fewer imports and a lot \
less code. \
 \
Arrow is heavily inspired by moment.js and requests."
LICENSE = "Apache-2.0"

PV = "1.2.3"

RPM_NAME = "python310-arrow-1.2.3-2.1.noarch.rpm"
RPM_HASH = "145b499425cd9bc49a7bc9b8d41ea31ebf3b0932787c23469dd3388490a99acdd97b1e78297f421986e8fe5421e60618d4ddbe1c7fd6e389bef8e9beed9718b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-arrow \
python3.10dist(arrow) \
python310-arrow \
python3dist(arrow)"
RDEPENDS:${PN} += "python(abi) \
python310-python-dateutil"

inherit rpm
