SUMMARY = "The test submodules of the python-dask package"
DESCRIPTION = "Dask is a flexible library for parallel computing in Python. \
This subpackage provides the .test submodules in the sitelib required for \
unit testing dask."
LICENSE = "BSD-3-Clause"

PV = "2023.3.2"

RPM_NAME = "python39-dask-test-2023.3.2-3.1.noarch.rpm"
RPM_HASH = "decd6f378f0d9a6ec5e3a07f1adf248ed5e5d71f0e9eb424f1cf3c1837e9cc98f2eb9deb3679003e621814b6a1377407f80a3904b5740fe6fb40d769bcef4e46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-dask-test"
RDEPENDS:${PN} += "python(abi) \
python39-dask-complete"

inherit rpm
