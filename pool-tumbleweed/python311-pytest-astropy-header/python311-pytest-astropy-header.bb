SUMMARY = "Pytest plugin to add diagnostic information to the header of the test output"
DESCRIPTION = "This plugin package provides a way to include information about the system, \
Python installation, and select dependencies in the header of the output when \
running pytest. It can be used with packages that are not affiliated with the \
Astropy project, but is optimized for use with astropy-related projects."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "python311-pytest-astropy-header-0.2.2-1.3.noarch.rpm"
RPM_HASH = "8b20af2051e3c09ebefb9a6e03130cf949d1e2ca839e19d99f6aa062e3e1c349810cec2bd2e827baa096fce0b2668366445ad9cabfe0cbac645d4997632c3e31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-astropy-header) \
python311-pytest-astropy-header \
python311-pytest_astropy_header \
python3dist(pytest-astropy-header)"
RDEPENDS:${PN} += "python(abi) \
python311-pytest"

inherit rpm
