SUMMARY = "Pytest plugin to add diagnostic information to the header of the test output"
DESCRIPTION = "This plugin package provides a way to include information about the system, \
Python installation, and select dependencies in the header of the output when \
running pytest. It can be used with packages that are not affiliated with the \
Astropy project, but is optimized for use with astropy-related projects."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "python310-pytest-astropy-header-0.2.2-1.3.noarch.rpm"
RPM_HASH = "dc07c6b664d78605a6ca2730b0b4a2b4f049060f3c7ef413af38e785db97cb9c9d97ce045cbdfce9778c0ca136ed9a2dc508faeeeb352b0d97665e61555fc456"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-astropy-header \
python3-pytest_astropy_header \
python3.10dist(pytest-astropy-header) \
python310-pytest-astropy-header \
python310-pytest_astropy_header \
python3dist(pytest-astropy-header)"
RDEPENDS:${PN} += "python(abi) \
python310-pytest"

inherit rpm
