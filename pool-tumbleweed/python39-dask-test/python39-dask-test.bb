SUMMARY = "The test submodules of the python-dask package"
DESCRIPTION = "Dask is a flexible library for parallel computing in Python. \
This subpackage provides the .test submodules in the sitelib required for \
unit testing dask."
LICENSE = "BSD-3-Clause"

PV = "2023.5.1"

RPM_NAME = "python39-dask-test-2023.5.1-2.4.noarch.rpm"
RPM_HASH = "9677866d1541645decaef8dc4c05822393cc6f803de96060a4ae472328698d3e834fb9edd0a5a6efb17061e9b5f73c80c331f0db26f933a53c5b03f08c274ad6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-dask-test"

RDEPENDS:${PN} += "python-abi \
python39-dask-complete \
python39-hypothesis \
python39-pandas \
python39-pre-commit \
python39-pytest \
python39-pytest-asyncio \
python39-pytest-rerunfailures \
python39-pytest-xdist"

inherit rpm
