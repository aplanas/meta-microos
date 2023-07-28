SUMMARY = "The test submodules of the python-dask package"
DESCRIPTION = "Dask is a flexible library for parallel computing in Python. \
This subpackage provides the .test submodules in the sitelib required for \
unit testing dask."
LICENSE = "BSD-3-Clause"

PV = "2023.5.1"

RPM_NAME = "python311-dask-test-2023.5.1-2.4.noarch.rpm"
RPM_HASH = "eabdfae92136c2bf6412f1f48a6892308134d3d2dda3495cef93062c0101724b5d43759022dadb70059bc4f99c42fcf759f650494371880e5d5bc49199502a9d"
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
