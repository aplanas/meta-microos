SUMMARY = "Pytest plugin to add diagnostic information to the header of the test output"
DESCRIPTION = "This plugin package provides a way to include information about the system, \
Python installation, and select dependencies in the header of the output when \
running pytest. It can be used with packages that are not affiliated with the \
Astropy project, but is optimized for use with astropy-related projects."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "python311-pytest-astropy-header-0.2.2-1.5.noarch.rpm"
RPM_HASH = "4508ca0508d77a71bbb6f51e7d59c83e34ce59b9563e80edbe62bfc85a3c2a1f8b35b9dfc3f6c539ef7c32943ee36a9ed822216f315e266530f44fa88361421b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-astropy-header \
python3.11dist-pytest-astropy-header \
python311-pytest-astropy-header \
python3dist-pytest-astropy-header"

RDEPENDS:${PN} += "python-abi \
python311-pytest"

inherit rpm
