SUMMARY = "The test submodules of the python-dask package"
DESCRIPTION = "Dask is a flexible library for parallel computing in Python. \
This subpackage provides the .test submodules in the sitelib required for \
unit testing dask."
LICENSE = "BSD-3-Clause"

PV = "2023.5.1"

RPM_NAME = "python311-dask-test-2023.5.1-2.3.noarch.rpm"
RPM_HASH = "1dd7b144da37218f83f136067afcc3f4f310d472725ca7963a0af89d0fc9d2715565687aff0dea696208192e3ae06a59a8be3e47c4325bb51416758b4b1e6e5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dask-test \
python311-dask-test"

RDEPENDS:${PN} += "python-abi \
python311-dask-complete \
python311-hypothesis \
python311-pandas \
python311-pre-commit \
python311-pytest \
python311-pytest-asyncio \
python311-pytest-rerunfailures \
python311-pytest-xdist"

inherit rpm
