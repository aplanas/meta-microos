SUMMARY = "Python API for MISP"
DESCRIPTION = "PyMISP is a Python library to access MISP platforms via their REST API. \
 \
PyMISP allows you to fetch events, add or update events/attributes, add or update samples or search for attributes."
LICENSE = "BSD-2-Clause"

PV = "2.4.170.2"

RPM_NAME = "python310-pymisp-2.4.170.2-1.1.noarch.rpm"
RPM_HASH = "bc90192e07646d7ef629cbbc4eb12c87fcbbf4bc2aba34c9b6550e69d123d68dc638456648d7f27bc7e26ac75cfee96104e60807fd52c1bc1e204381f6522546"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pymisp \
python310-pymisp \
python3dist-pymisp"

RDEPENDS:${PN} += "python-abi \
python310-Deprecated \
python310-jsonschema \
python310-python-dateutil \
python310-requests"

inherit rpm
