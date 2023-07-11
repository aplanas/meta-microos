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

RPM_NAME = "python39-arrow-1.2.3-2.2.noarch.rpm"
RPM_HASH = "c63fadbdb4c87efbc60e2afd815f639e837f5533d2e0b1537597f67c1369986fa957ce63d93b02c079e70545677798f050d6d93031b782da260ca4d2f5ba1546"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-arrow \
python39-arrow \
python3dist-arrow"

RDEPENDS:${PN} += "python-abi \
python39-python-dateutil"

inherit rpm
