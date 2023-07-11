SUMMARY = "Pytest plugin to run your tests in a specific order"
DESCRIPTION = "A pytest plugin that allows you to customize the order in which your tests are \
run. It uses the marker order that defines when a specific test shall be run \
relative to the other tests. pytest-order is a fork of pytest-ordering that \
provides some additional features."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-pytest-order-1.1.0-1.3.noarch.rpm"
RPM_HASH = "94ad5ab7f33825f2f3caacae0868e832db54c70474b2bf9b93cca087d9c9df2e372ffe041a566e1fac230ad82d73234967d93a23180d6b0eeb8304e0c46030d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-order \
python310-pytest-order \
python3dist-pytest-order"

RDEPENDS:${PN} += "python-abi \
python310-pytest"

inherit rpm
