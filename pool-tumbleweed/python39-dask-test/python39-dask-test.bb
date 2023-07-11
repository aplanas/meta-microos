SUMMARY = "The test submodules of the python-dask package"
DESCRIPTION = "Dask is a flexible library for parallel computing in Python. \
This subpackage provides the .test submodules in the sitelib required for \
unit testing dask."
LICENSE = "BSD-3-Clause"

PV = "2023.5.1"

RPM_NAME = "python39-dask-test-2023.5.1-2.3.noarch.rpm"
RPM_HASH = "eee16cb4ba296e83443c7032b8236c90b17ea80b9d0e88b0e7ec952557dc9d6d5a26c428528f54859b7b1eea8b19e42c97bbfc8ffc8230b4fb7c9434aed9ccb6"
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
