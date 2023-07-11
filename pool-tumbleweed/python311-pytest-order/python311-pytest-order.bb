SUMMARY = "Pytest plugin to run your tests in a specific order"
DESCRIPTION = "A pytest plugin that allows you to customize the order in which your tests are \
run. It uses the marker order that defines when a specific test shall be run \
relative to the other tests. pytest-order is a fork of pytest-ordering that \
provides some additional features."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-pytest-order-1.1.0-1.3.noarch.rpm"
RPM_HASH = "682faa3c9be01984a590c815f62124844122a29bb5a84afa2806e502a9a82ad18324a240f79be924355a4825ff76bd8a609a5dda75de8f5675306a2aba9d329a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-order \
python3.11dist-pytest-order \
python311-pytest-order \
python3dist-pytest-order"

RDEPENDS:${PN} += "python-abi \
python311-pytest"

inherit rpm
