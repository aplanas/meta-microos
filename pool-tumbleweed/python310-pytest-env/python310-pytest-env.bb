SUMMARY = "Pytest plugin to add environment variables"
DESCRIPTION = "A py.test plugin that allows you to add environment variables."
LICENSE = "MIT"

PV = "0.8.2"

RPM_NAME = "python310-pytest-env-0.8.2-1.1.noarch.rpm"
RPM_HASH = "bc50f4b10db9b7a1d38577efb10d1f3ac5a3f34f76b37662b041cb7952a3efea423be64dd16d4c508fd22fd4e60cbbc3337cec3b51c2e835a0337de6d95bb002"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-env \
python310-pytest-env \
python3dist-pytest-env"

RDEPENDS:${PN} += "python-abi \
python310-pytest"

inherit rpm
