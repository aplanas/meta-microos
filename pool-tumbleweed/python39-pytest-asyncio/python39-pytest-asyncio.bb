SUMMARY = "Pytest support for asyncio"
DESCRIPTION = "pytest-asyncio is a Python library used for testing asyncio code with pytest. \
 \
asyncio code is usually written in the form of coroutines, which makes it \
slightly more difficult to test using normal testing tools. pytest-asyncio \
provides useful fixtures and markers to make testing easier."
LICENSE = "Apache-2.0"

PV = "0.21.0"

RPM_NAME = "python39-pytest-asyncio-0.21.0-1.1.noarch.rpm"
RPM_HASH = "f9e3d0e1ff9908ede4acf6fa7dfa45501fb39af9b62458243f7f3bd252ccf7347b0b434369aefd81253768d5f7d5955fa6bfca43e895ff47e81440e453f8fd03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-asyncio) \
python39-pytest-asyncio \
python3dist(pytest-asyncio)"
RDEPENDS:${PN} += "python(abi) \
python39-pytest"

inherit rpm
