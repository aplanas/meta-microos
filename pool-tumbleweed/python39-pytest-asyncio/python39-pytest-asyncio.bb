SUMMARY = "Pytest support for asyncio"
DESCRIPTION = "pytest-asyncio is a Python library used for testing asyncio code with pytest. \
 \
asyncio code is usually written in the form of coroutines, which makes it \
slightly more difficult to test using normal testing tools. pytest-asyncio \
provides useful fixtures and markers to make testing easier."
LICENSE = "Apache-2.0"

PV = "0.21.1"

RPM_NAME = "python39-pytest-asyncio-0.21.1-1.1.noarch.rpm"
RPM_HASH = "237d31cc0f75fe3f70afe6bf65c7754c30f6ffb3790d92d1ca2022e689e9ad1143834e7edba288a07f753c1365a7e695dc0f93bb1170db8565964d8b9659fa91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-asyncio \
python39-pytest-asyncio \
python3dist-pytest-asyncio"

RDEPENDS:${PN} += "python-abi \
python39-pytest"

inherit rpm
