SUMMARY = "The test submodules of the python-dask package"
DESCRIPTION = "Dask is a flexible library for parallel computing in Python. \
This subpackage provides the .test submodules in the sitelib required for \
unit testing dask."
LICENSE = "BSD-3-Clause"

PV = "2023.5.1"

RPM_NAME = "python310-dask-test-2023.5.1-2.5.noarch.rpm"
RPM_HASH = "b6a0d15edf2a21ddfa8916f17427d80630a1fbb6e08e11cdc649040b36da77b27a324091e5fa839dfcd3b898d9a1af78fc1798494630ad9ab95383f205a7b7fd"
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
