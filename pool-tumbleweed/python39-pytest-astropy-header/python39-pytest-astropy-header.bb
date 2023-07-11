SUMMARY = "Pytest plugin to add diagnostic information to the header of the test output"
DESCRIPTION = "This plugin package provides a way to include information about the system, \
Python installation, and select dependencies in the header of the output when \
running pytest. It can be used with packages that are not affiliated with the \
Astropy project, but is optimized for use with astropy-related projects."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "python39-pytest-astropy-header-0.2.2-1.5.noarch.rpm"
RPM_HASH = "7bdefec04f5921b82137e15f7c27dae1636a72ed9cb42974009a6b4077ec7ce0742a5430ea0a54419fe7ed781c1ec81cce1963c0bb9ae7f4a13bdf9a1c604299"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-astropy-header \
python39-pytest-astropy-header \
python3dist-pytest-astropy-header"

RDEPENDS:${PN} += "python-abi \
python39-pytest"

inherit rpm
