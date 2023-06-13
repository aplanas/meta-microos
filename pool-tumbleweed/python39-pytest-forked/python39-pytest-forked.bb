SUMMARY = "Run each test in a forked subprocess"
DESCRIPTION = "Extraction of pytest-xdist --forked module used for running tests in forked subprocess"
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python39-pytest-forked-1.6.0-2.1.noarch.rpm"
RPM_HASH = "95e560bb4115d499e64ef24e5b4ed19beb4816ff7762e0da158853e46bab4999abc911e4bb3778eaa02f07a04ea4559059de5c185d09061f9f9ce57fa92cd6fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-forked) \
python39-pytest-forked \
python3dist(pytest-forked)"

RDEPENDS:${PN} += "python(abi) \
python39-py \
python39-pytest"

inherit rpm
