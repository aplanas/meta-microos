SUMMARY = "Pytest plugin for controlling remote data access"
DESCRIPTION = "This package provides a plugin for the pytest framework that allows \
developers to control unit tests that require access to data from the internet."
LICENSE = "BSD-3-Clause"

PV = "0.4.0"

RPM_NAME = "python311-pytest-remotedata-0.4.0-1.3.noarch.rpm"
RPM_HASH = "cea72146ef630ce9519bd0084c47a753a71df877555f88d39dffddafeec12a1c2e87a50085454c17fcc9e36c93718b2b0ef22a18c7c5b9de507c3c69b5fb1ecb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-remotedata \
python3.11dist-pytest-remotedata \
python311-pytest-remotedata \
python3dist-pytest-remotedata"

RDEPENDS:${PN} += "python-abi \
python311-packaging \
python311-pytest"

inherit rpm
