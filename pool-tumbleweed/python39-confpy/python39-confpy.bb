SUMMARY = "Config file parsing and option management"
DESCRIPTION = "Config file parsing and option management."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python39-confpy-0.11.0-1.14.noarch.rpm"
RPM_HASH = "a0982cffbca3e53566a954942310622fe363e90d1fdc83b03b9fe05f55f8a6ccf26ebd5a283439c152e32dfdc5fe3e2efaa293d9e03086cd31f5748d42375dc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-confpy \
python39-confpy \
python3dist-confpy"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi"

inherit rpm
