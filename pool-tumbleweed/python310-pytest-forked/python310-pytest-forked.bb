SUMMARY = "Run each test in a forked subprocess"
DESCRIPTION = "Extraction of pytest-xdist --forked module used for running tests in forked subprocess"
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python310-pytest-forked-1.6.0-2.1.noarch.rpm"
RPM_HASH = "51dfaea7f132adf152826c78fd619b43a7f17a016cb5ef9232df153658d16c5ba3769c8e9ddfd7ce39043fb0a20275ec1cde54950f71f9f3e17f5ca7fe076d56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-forked \
python3.10dist(pytest-forked) \
python310-pytest-forked \
python3dist(pytest-forked)"

RDEPENDS:${PN} += "python(abi) \
python310-py \
python310-pytest"

inherit rpm
