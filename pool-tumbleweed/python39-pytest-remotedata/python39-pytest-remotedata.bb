SUMMARY = "Pytest plugin for controlling remote data access"
DESCRIPTION = "This package provides a plugin for the pytest framework that allows \
developers to control unit tests that require access to data from the internet."
LICENSE = "BSD-3-Clause"

PV = "0.4.0"

RPM_NAME = "python39-pytest-remotedata-0.4.0-1.3.noarch.rpm"
RPM_HASH = "ece49642f3afa40e64e73da97902c2ba47dc53563b26a08bd8deea00c9c0c32b4a3cea9e6869369b0e9f83cdbd7b8ed2bb6fd3dabdea1840c318449ea436fd9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-remotedata \
python39-pytest-remotedata \
python3dist-pytest-remotedata"

RDEPENDS:${PN} += "python-abi \
python39-packaging \
python39-pytest"

inherit rpm
