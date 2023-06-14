SUMMARY = "Pytest plugin for controlling remote data access"
DESCRIPTION = "This package provides a plugin for the pytest framework that allows \
developers to control unit tests that require access to data from the internet."
LICENSE = "BSD-3-Clause"

PV = "0.4.0"

RPM_NAME = "python39-pytest-remotedata-0.4.0-1.1.noarch.rpm"
RPM_HASH = "ad66dbcc0be191d6713b0618dc254f94bb72a30d3d1b1acf92292f6fda5a7ec2e4ed8b8c20ea070aaed97d8585334a7f7edaa8f4874f880061c949aaca32dc7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-remotedata \
python39-pytest-remotedata \
python3dist-pytest-remotedata"

RDEPENDS:${PN} += "python-abi \
python39-packaging \
python39-pytest"

inherit rpm
