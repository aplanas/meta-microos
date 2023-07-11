SUMMARY = "Python logging component with a simple interface"
DESCRIPTION = "Python logging component providing a single object \
which dispatches log messages to configured handlers."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python311-loguru-0.7.0-2.3.noarch.rpm"
RPM_HASH = "5d76477230d9488fb3ba0403c8b9ae2f8db88a98fff601f6634ff5118d810dc0355b7852e3c43d93ab5b69ed92310e4d3ca4bfe3b72e9abf07f403188a6fe65e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-loguru \
python3.11dist-loguru \
python311-loguru \
python3dist-loguru"

RDEPENDS:${PN} += "python-abi"

inherit rpm
