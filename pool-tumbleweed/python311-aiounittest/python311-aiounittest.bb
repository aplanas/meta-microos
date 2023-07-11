SUMMARY = "Test AyncIO Python Code Easily"
DESCRIPTION = "This is a helper library to ease of your pain (and boilerplate), when writing a \
test of the asynchronous code (asyncio). You can test: \
 \
* synchronous code (same as the unittest.TestCase) \
* asynchronous code, it supports syntax with async/await (Python 3.5+) and \
  asyncio.coroutine/yield from (Python 3.4)"
LICENSE = "MIT"

PV = "1.4.2"

RPM_NAME = "python311-aiounittest-1.4.2-2.3.noarch.rpm"
RPM_HASH = "d96d2ac465f5a4eaf8db99d47918d16962af05d3b8738babdd669b0a892cd3f2b91a768182457b9a4b5241bf4824cddd001ac6a8ed556a3fd485e01ba83dd44b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiounittest \
python3.11dist-aiounittest \
python311-aiounittest \
python3dist-aiounittest"

RDEPENDS:${PN} += "python-abi \
python311-wrapt"

inherit rpm
