SUMMARY = "Pytest plugin to run your tests in a specific order"
DESCRIPTION = "A pytest plugin that allows you to customize the order in which your tests are \
run. It uses the marker order that defines when a specific test shall be run \
relative to the other tests. pytest-order is a fork of pytest-ordering that \
provides some additional features."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-pytest-order-1.1.0-1.1.noarch.rpm"
RPM_HASH = "970032b64763dfab3d39c787c4251cc2d53e191f3ede81a75a27ea2a9312f7c3a33d4d961279bcec9f4b2e9c92e859f15c614faab1b2bd698aab3abdc1571b0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-order \
python39-pytest-order \
python3dist-pytest-order"

RDEPENDS:${PN} += "python-abi \
python39-pytest"

inherit rpm
