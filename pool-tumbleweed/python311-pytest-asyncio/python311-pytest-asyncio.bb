SUMMARY = "Pytest support for asyncio"
DESCRIPTION = "pytest-asyncio is a Python library used for testing asyncio code with pytest. \
 \
asyncio code is usually written in the form of coroutines, which makes it \
slightly more difficult to test using normal testing tools. pytest-asyncio \
provides useful fixtures and markers to make testing easier."
LICENSE = "Apache-2.0"

PV = "0.21.0"

RPM_NAME = "python311-pytest-asyncio-0.21.0-1.3.noarch.rpm"
RPM_HASH = "0fa7d2f086a00b774d4bc7312fc8f34112184e3b189e68cec9bf67d228bc6f5de5bd83d6bbc47ad70a3072da30627b35692d90012e6bb88216f250886999fea0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-asyncio \
python3.11dist-pytest-asyncio \
python311-pytest-asyncio \
python3dist-pytest-asyncio"

RDEPENDS:${PN} += "python-abi \
python311-pytest"

inherit rpm
