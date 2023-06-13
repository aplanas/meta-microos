SUMMARY = "Flake8 plugin that checks the ordering of import statements"
DESCRIPTION = "Flake8 and pylama plugin that checks the ordering of import statements."
LICENSE = "LGPL-3.0-only"

PV = "0.18.2"

RPM_NAME = "python311-flake8-import-order-0.18.2-1.4.noarch.rpm"
RPM_HASH = "2a4baa052d8998b0258acfa8b1d4990f4af1fe4b9c7ecf227b8c28b06da3bc041f83b5d8d2c50e86e9e9eb820ccb05dad60db05121bf43a4c75d43c523a435f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(flake8-import-order) \
python311-flake8-import-order \
python3dist(flake8-import-order)"

RDEPENDS:${PN} += "python(abi) \
python311-flake8 \
python311-pycodestyle"

inherit rpm
