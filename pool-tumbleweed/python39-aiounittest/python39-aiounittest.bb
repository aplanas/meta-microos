SUMMARY = "Test AyncIO Python Code Easily"
DESCRIPTION = "This is a helper library to ease of your pain (and boilerplate), when writing a \
test of the asynchronous code (asyncio). You can test: \
 \
* synchronous code (same as the unittest.TestCase) \
* asynchronous code, it supports syntax with async/await (Python 3.5+) and \
  asyncio.coroutine/yield from (Python 3.4)"
LICENSE = "MIT"

PV = "1.4.2"

RPM_NAME = "python39-aiounittest-1.4.2-2.1.noarch.rpm"
RPM_HASH = "413a501a1ae7a1660210631d8741cfba95553ec37d67dff76045bb13ddf1c2a8c4497a4ac5a2d64570be6d0b3b7d0a621cde701da128eef503b492a6781c9aba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-aiounittest \
python39-aiounittest \
python3dist-aiounittest"

RDEPENDS:${PN} += "python-abi \
python39-wrapt"

inherit rpm
