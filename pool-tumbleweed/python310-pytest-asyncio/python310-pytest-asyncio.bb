SUMMARY = "Pytest support for asyncio"
DESCRIPTION = "pytest-asyncio is a Python library used for testing asyncio code with pytest. \
 \
asyncio code is usually written in the form of coroutines, which makes it \
slightly more difficult to test using normal testing tools. pytest-asyncio \
provides useful fixtures and markers to make testing easier."
LICENSE = "Apache-2.0"

PV = "0.21.0"

RPM_NAME = "python310-pytest-asyncio-0.21.0-1.3.noarch.rpm"
RPM_HASH = "72146d4eac1128bcc86a2765f18dbb0c09d7a9807a15ab21a25574507f2d36d399c8f773abaeab9b7aa24d067a152e1d7ecedc7fde1b13662e4570cb25e3b5df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-asyncio \
python310-pytest-asyncio \
python3dist-pytest-asyncio"

RDEPENDS:${PN} += "python-abi \
python310-pytest"

inherit rpm
