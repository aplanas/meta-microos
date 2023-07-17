SUMMARY = "Describe-style plugin for pytest"
DESCRIPTION = "Describe-style plugin for pytest."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python311-pytest-describe-2.1.0-2.1.noarch.rpm"
RPM_HASH = "6a0907f5143d917e7ecc119e4972b95468908be5edb0c2c981e9e09bd2a361546fc46da898615dc2e5af810e2e05ee223935a7f9b8f8c1d891c7e32917b7ad59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-describe \
python3.11dist-pytest-describe \
python311-pytest-describe \
python3dist-pytest-describe"

RDEPENDS:${PN} += "python-abi \
python311-py \
python311-pytest"

inherit rpm
