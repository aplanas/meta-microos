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

RPM_NAME = "python310-arrow-1.2.3-2.2.noarch.rpm"
RPM_HASH = "027c821b81285933afcab59f0c9bdbe47c56ba930cfec0c7237c882e39184dd69694360e4dca2b0cc4652c9961bf9b8e2dcfb3ccbdde998220df52c48cd8b325"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-arrow \
python310-arrow \
python3dist-arrow"

RDEPENDS:${PN} += "python-abi \
python310-python-dateutil"

inherit rpm
