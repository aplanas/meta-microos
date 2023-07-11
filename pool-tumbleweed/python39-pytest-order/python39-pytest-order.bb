SUMMARY = "Pytest plugin to run your tests in a specific order"
DESCRIPTION = "A pytest plugin that allows you to customize the order in which your tests are \
run. It uses the marker order that defines when a specific test shall be run \
relative to the other tests. pytest-order is a fork of pytest-ordering that \
provides some additional features."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-pytest-order-1.1.0-1.3.noarch.rpm"
RPM_HASH = "f711dd8ec8463bcae8b7d006c22651c72c55fc21f061d968f1f123724617d9a1fe41acc8d2c86243316922e9f312164b37d0250169d91d79f976618c071e70fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-order \
python39-pytest-order \
python3dist-pytest-order"

RDEPENDS:${PN} += "python-abi \
python39-pytest"

inherit rpm
