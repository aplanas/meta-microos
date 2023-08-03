SUMMARY = "Pytest support for asyncio"
DESCRIPTION = "pytest-asyncio is a Python library used for testing asyncio code with pytest. \
 \
asyncio code is usually written in the form of coroutines, which makes it \
slightly more difficult to test using normal testing tools. pytest-asyncio \
provides useful fixtures and markers to make testing easier."
LICENSE = "Apache-2.0"

PV = "0.21.1"

RPM_NAME = "python311-pytest-asyncio-0.21.1-1.1.noarch.rpm"
RPM_HASH = "073b00b00fbf90a4e4d3bab08130eae32172c5c82283cfc0471620b3a752cd43423fb884cbabc8d8886637ac2913c2a4b7e61fe8ddbc43261f09da18a74b510b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-asyncio \
python3.11dist-pytest-asyncio \
python311-pytest-asyncio \
python3dist-pytest-asyncio"

RDEPENDS:${PN} += "python-abi \
python311-pytest"

inherit rpm
