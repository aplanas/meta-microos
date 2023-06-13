SUMMARY = "Pytest plugin for controlling remote data access"
DESCRIPTION = "This package provides a plugin for the pytest framework that allows \
developers to control unit tests that require access to data from the internet."
LICENSE = "BSD-3-Clause"

PV = "0.4.0"

RPM_NAME = "python311-pytest-remotedata-0.4.0-1.1.noarch.rpm"
RPM_HASH = "41512e3bd35a7cb166c305698381dd656ff18460845fba3ead6b1b1433e44ad28b76f35f1b1192177013542efc1e43f71ce5ef5c9f26c4bf541d5f42ce7ad5c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-remotedata) \
python311-pytest-remotedata \
python3dist(pytest-remotedata)"

RDEPENDS:${PN} += "python(abi) \
python311-packaging \
python311-pytest"

inherit rpm
