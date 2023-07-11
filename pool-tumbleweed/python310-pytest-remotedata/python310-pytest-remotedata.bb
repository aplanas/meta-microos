SUMMARY = "Pytest plugin for controlling remote data access"
DESCRIPTION = "This package provides a plugin for the pytest framework that allows \
developers to control unit tests that require access to data from the internet."
LICENSE = "BSD-3-Clause"

PV = "0.4.0"

RPM_NAME = "python310-pytest-remotedata-0.4.0-1.3.noarch.rpm"
RPM_HASH = "4e4ca86db67ff26a0557dbc9bb367ee30d42e0f631d671c494c91b840641fa32c1b996583db92e9bcbb5129bbac7d6d1d05e70aed3ef3c646ea9525fd9f589cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-remotedata \
python310-pytest-remotedata \
python3dist-pytest-remotedata"

RDEPENDS:${PN} += "python-abi \
python310-packaging \
python310-pytest"

inherit rpm
