SUMMARY = "Pytest plugin to add environment variables"
DESCRIPTION = "A py.test plugin that allows you to add environment variables."
LICENSE = "MIT"

PV = "0.8.1"

RPM_NAME = "python311-pytest-env-0.8.1-1.3.noarch.rpm"
RPM_HASH = "107b7c9037168c1466974fc2b44dadf5b4ede715aba2b324fe918367364b061ee139af2bcde171cff42e4266c65f0aef0c38b3a0b3fceb64ceaa39987b23b013"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-env \
python3.11dist-pytest-env \
python311-pytest-env \
python3dist-pytest-env"

RDEPENDS:${PN} += "python-abi \
python311-pytest"

inherit rpm
