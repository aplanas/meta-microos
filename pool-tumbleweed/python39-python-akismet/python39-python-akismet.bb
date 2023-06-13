SUMMARY = "Akismet v1.1 module for Python"
DESCRIPTION = "Akismet v1.1 module for Python."
LICENSE = "MIT"

PV = "0.4.3"

RPM_NAME = "python39-python-akismet-0.4.3-1.3.noarch.rpm"
RPM_HASH = "88a9917f321915d2fb51937039d7b56fa0ab161c124c75627fb56d23300ab1c1fe4591e658d7d9cb5d2979c4f2bf7b44aa6adff38fef8def095b85b2ad7468d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-akismet) \
python39-python-akismet \
python3dist(python-akismet)"

RDEPENDS:${PN} += "python(abi) \
python39-requests"

inherit rpm
