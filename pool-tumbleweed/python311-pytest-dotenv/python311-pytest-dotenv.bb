SUMMARY = "A pytest plugin that parses environment files"
DESCRIPTION = "A py.test plugin that parses environment files before running tests."
LICENSE = "MIT"

PV = "0.5.2"

RPM_NAME = "python311-pytest-dotenv-0.5.2-1.12.noarch.rpm"
RPM_HASH = "8281812267c25fc0948aecd9c39f62f9d19521dce70886395e0e6fab84936658ae38ad8c94230627b18fb27ecfd02892fb01ba5d71d43c28b2df415703306b97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-dotenv) \
python311-pytest-dotenv \
python3dist(pytest-dotenv)"

RDEPENDS:${PN} += "python(abi) \
python311-pytest \
python311-python-dotenv"

inherit rpm
