SUMMARY = "Pytest plugin to add diagnostic information to the header of the test output"
DESCRIPTION = "This plugin package provides a way to include information about the system, \
Python installation, and select dependencies in the header of the output when \
running pytest. It can be used with packages that are not affiliated with the \
Astropy project, but is optimized for use with astropy-related projects."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "python310-pytest-astropy-header-0.2.2-1.5.noarch.rpm"
RPM_HASH = "d0b59a19f0baf2841a4f33ab70f5008cae60b4e15724d81795e47d2643d26fc6ae1856632c31743b1a5d3c191c570acfba8c4b5a7c92fee29a584c439c8d8e67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-astropy-header \
python310-pytest-astropy-header \
python3dist-pytest-astropy-header"

RDEPENDS:${PN} += "python-abi \
python310-pytest"

inherit rpm
