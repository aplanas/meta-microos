SUMMARY = "Send responses to httpx"
DESCRIPTION = "Send responses to httpx."
LICENSE = "MIT"

PV = "0.22.0"

RPM_NAME = "python310-pytest-httpx-0.22.0-2.1.noarch.rpm"
RPM_HASH = "4f7c6b6256fe4f27c5dfd46b777391be008e810bbb2c2b3b230efc567f09b31f2380993a59ad14db98d4adffec2b2b9c4719e6ca4fa1a286ee63e5c746ddc740"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-httpx \
python310-pytest-httpx \
python3dist-pytest-httpx"

RDEPENDS:${PN} += "python-abi \
python310-httpx \
python310-pytest"

inherit rpm
