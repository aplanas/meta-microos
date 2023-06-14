SUMMARY = "Pytest plugin to add environment variables"
DESCRIPTION = "A py.test plugin that allows you to add environment variables."
LICENSE = "MIT"

PV = "0.8.1"

RPM_NAME = "python311-pytest-env-0.8.1-1.1.noarch.rpm"
RPM_HASH = "835d86ebeed31915461f54fc0df2bc607c90a89b0975c2c04501d4058d1aaae1ff28bfde574ef10f83f49c4c9be0cd5a7d5ec913a4e79d6cd6645c159c23f837"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pytest-env \
python311-pytest-env \
python3dist-pytest-env"

RDEPENDS:${PN} += "python-abi \
python311-pytest"

inherit rpm
