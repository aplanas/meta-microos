SUMMARY = "Pytest plugin to run pycodestyle"
DESCRIPTION = "pytest plugin to run pycodestyle in python tests"
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "python311-pytest-pycodestyle-2.3.1-1.5.noarch.rpm"
RPM_HASH = "188d215c72c2309524805b70c9414ad139e5a6caf47efc7639308339dcf7c7df98450a725c099a05fe2d380d3c855a0258b93a0948092f20dcde1901809c45d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-codestyle \
python3-pytest-pycodestyle \
python3.11dist-pytest-pycodestyle \
python311-pytest-codestyle \
python311-pytest-pycodestyle \
python3dist-pytest-pycodestyle"

RDEPENDS:${PN} += "python-abi \
python311-py \
python311-pycodestyle \
python311-pytest \
python311-setuptools"

inherit rpm
