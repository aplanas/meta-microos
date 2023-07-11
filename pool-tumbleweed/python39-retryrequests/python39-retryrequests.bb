SUMMARY = "Extend python requests with exponential back-off retry"
DESCRIPTION = "A Python library for HTTP requests using requests package with \
exponential back-off retry."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python39-retryrequests-0.2.0-1.5.noarch.rpm"
RPM_HASH = "5c5d51d95b852b6d572bdb4d573c4536de977f732daf673d25b12cef99adaacafb0e3a204048c08e9edd75d90fa205a7b93d3aeed34984f6744225626a2b2612"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-retryrequests \
python39-retryrequests \
python3dist-retryrequests"

RDEPENDS:${PN} += "python-abi \
python39-requests \
python39-setuptools"

inherit rpm
