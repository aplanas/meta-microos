SUMMARY = "Pytest support for asyncio"
DESCRIPTION = "pytest-asyncio is a Python library used for testing asyncio code with pytest. \
 \
asyncio code is usually written in the form of coroutines, which makes it \
slightly more difficult to test using normal testing tools. pytest-asyncio \
provides useful fixtures and markers to make testing easier."
LICENSE = "Apache-2.0"

PV = "0.21.1"

RPM_NAME = "python310-pytest-asyncio-0.21.1-1.1.noarch.rpm"
RPM_HASH = "6071920131d7b9b03a0edccd027a45fff401e7406f40332f83be215d6a7070513f4bcaeeb29662cc517fbd81ac982a26a42929d250f67e8fa016c70214bc71cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-asyncio \
python310-pytest-asyncio \
python3dist-pytest-asyncio"

RDEPENDS:${PN} += "python-abi \
python310-pytest"

inherit rpm
