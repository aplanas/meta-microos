SUMMARY = "Pytest support for asyncio"
DESCRIPTION = "pytest-asyncio is a Python library used for testing asyncio code with pytest. \
 \
asyncio code is usually written in the form of coroutines, which makes it \
slightly more difficult to test using normal testing tools. pytest-asyncio \
provides useful fixtures and markers to make testing easier."
LICENSE = "Apache-2.0"

PV = "0.21.0"

RPM_NAME = "python39-pytest-asyncio-0.21.0-1.3.noarch.rpm"
RPM_HASH = "01dbfe0efa58ccee0aac4fba1beeafd04945b04cf9a79ea88d7d2b574c92f9d4ff5410e6d2388aa675e6ee14de229d1c6a8a96801a1308bb6f7dd566dd517330"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-asyncio \
python39-pytest-asyncio \
python3dist-pytest-asyncio"

RDEPENDS:${PN} += "python-abi \
python39-pytest"

inherit rpm
