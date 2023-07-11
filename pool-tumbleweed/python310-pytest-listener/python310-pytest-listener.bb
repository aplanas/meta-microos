SUMMARY = "A simple network listener for py.test"
DESCRIPTION = "Simple JSON listener using TCP that listens for data and stores it in a queue for later retrieval."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python310-pytest-listener-1.7.0-4.5.noarch.rpm"
RPM_HASH = "8f69984d5694483ce7eaf9542c3e9eb5591b16d57ea87290b6c57f8711824dc09e5a8d98050e99cac37f939597d5a0003bb0c1b37e8cec76c6433209a142bc9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-listener \
python310-pytest-listener \
python3dist-pytest-listener"

RDEPENDS:${PN} += "python-abi \
python310-pytest-server-fixtures"

inherit rpm
