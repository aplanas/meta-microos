SUMMARY = "The test submodules of the python-dask package"
DESCRIPTION = "Dask is a flexible library for parallel computing in Python. \
This subpackage provides the .test submodules in the sitelib required for \
unit testing dask."
LICENSE = "BSD-3-Clause"

PV = "2023.5.1"

RPM_NAME = "python39-dask-test-2023.5.1-2.5.noarch.rpm"
RPM_HASH = "366ee66044e5fa4f81a7769d62b773f4da620e82cb32fd62a69ff8888d814e14b5859467be0dd61d053038c4c4281debfd2059cc6bbef2fd571e08a6e1b6c1b0"
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
