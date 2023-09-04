SUMMARY = "The test submodules of the python-dask package"
DESCRIPTION = "Dask is a flexible library for parallel computing in Python. \
This subpackage provides the .test submodules in the sitelib required for \
unit testing dask."
LICENSE = "BSD-3-Clause"

PV = "2023.5.1"

RPM_NAME = "python311-dask-test-2023.5.1-2.5.noarch.rpm"
RPM_HASH = "7a5a28decd82fccc1be0b0bb3a8b947d367928f59bf24f073c01770e681b47485e311cac9ca227f7504be8620091b990268b53aa6b33a7de26b1e45fa09ac9b7"
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
