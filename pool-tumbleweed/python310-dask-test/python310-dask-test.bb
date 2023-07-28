SUMMARY = "The test submodules of the python-dask package"
DESCRIPTION = "Dask is a flexible library for parallel computing in Python. \
This subpackage provides the .test submodules in the sitelib required for \
unit testing dask."
LICENSE = "BSD-3-Clause"

PV = "2023.5.1"

RPM_NAME = "python310-dask-test-2023.5.1-2.4.noarch.rpm"
RPM_HASH = "86a8d1273faadedefa8e4a100e6e2f9edfa01482b551a346a48554e72b42ec6846641c3ceeb1e25bb09c1663408f3c11b99c6991f49b2c68e387dd664f2ea6e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-dask-test"

RDEPENDS:${PN} += "python-abi \
python310-dask-complete \
python310-hypothesis \
python310-pandas \
python310-pre-commit \
python310-pytest \
python310-pytest-asyncio \
python310-pytest-rerunfailures \
python310-pytest-xdist"

inherit rpm
