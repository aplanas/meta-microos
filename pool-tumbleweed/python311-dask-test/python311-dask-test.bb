SUMMARY = "The test submodules of the python-dask package"
DESCRIPTION = "Dask is a flexible library for parallel computing in Python. \
This subpackage provides the .test submodules in the sitelib required for \
unit testing dask."
LICENSE = "BSD-3-Clause"

PV = "2023.3.2"

RPM_NAME = "python311-dask-test-2023.3.2-3.1.noarch.rpm"
RPM_HASH = "10d601a6048a43168eef031b50cc2cab4c81096c52e1ce813cebe1162f784d2225a26d043f15d2e42ac93a7ad4d3a9aff28ba57bb15c5b1903d9cd4484ced567"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-dask-test"
RDEPENDS:${PN} += "python(abi) \
python311-dask-complete"

inherit rpm
