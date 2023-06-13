SUMMARY = "Pytest plugin to add diagnostic information to the header of the test output"
DESCRIPTION = "This plugin package provides a way to include information about the system, \
Python installation, and select dependencies in the header of the output when \
running pytest. It can be used with packages that are not affiliated with the \
Astropy project, but is optimized for use with astropy-related projects."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "python39-pytest-astropy-header-0.2.2-1.3.noarch.rpm"
RPM_HASH = "0bb6b2defe6ad701069fa30dd4cda1348a1ca3a92b6779f9c599f5c02d4c61e2a2e6d440e6c1fd2872b1c8bc6367fadd39704ce81339d4d035389e4b668e4c71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-astropy-header) \
python39-pytest-astropy-header \
python39-pytest_astropy_header \
python3dist(pytest-astropy-header)"

RDEPENDS:${PN} += "python(abi) \
python39-pytest"

inherit rpm
