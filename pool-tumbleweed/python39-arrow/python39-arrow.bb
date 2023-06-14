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

RPM_NAME = "python39-arrow-1.2.3-2.1.noarch.rpm"
RPM_HASH = "fe5ab67301e17c5dba7ea0ca9527f8d66d83fba787c7970eefcb00dea10a5b8bced8213e49b5d4d5c9dd2bf17e68ea43e01a8e1bc4228cb73b904f95aedba110"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-arrow \
python39-arrow \
python3dist-arrow"

RDEPENDS:${PN} += "python-abi \
python39-python-dateutil"

inherit rpm
