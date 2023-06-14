SUMMARY = "Pytest plugin to run your tests in a specific order"
DESCRIPTION = "A pytest plugin that allows you to customize the order in which your tests are \
run. It uses the marker order that defines when a specific test shall be run \
relative to the other tests. pytest-order is a fork of pytest-ordering that \
provides some additional features."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-pytest-order-1.1.0-1.1.noarch.rpm"
RPM_HASH = "dae718e4030ccb4c1c8a07747476bfdd4e7b3b5511b22484ca6f66af88fc3864e469425f2aed90c154c7a7a6232709cb07bcaf621ed8e19ebea13d731b40782e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pytest-order \
python311-pytest-order \
python3dist-pytest-order"

RDEPENDS:${PN} += "python-abi \
python311-pytest"

inherit rpm
