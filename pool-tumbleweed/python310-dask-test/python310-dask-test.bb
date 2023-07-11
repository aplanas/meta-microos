SUMMARY = "The test submodules of the python-dask package"
DESCRIPTION = "Dask is a flexible library for parallel computing in Python. \
This subpackage provides the .test submodules in the sitelib required for \
unit testing dask."
LICENSE = "BSD-3-Clause"

PV = "2023.5.1"

RPM_NAME = "python310-dask-test-2023.5.1-2.3.noarch.rpm"
RPM_HASH = "111dcd673f2d4cf89dab9083d01a48035f1c23cd744a1f2db8e2816b83cc38685c3fcb116ea1b2ae83c777a5d77c3780bebbb8d9718810a6f7da616b1bb32d74"
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
