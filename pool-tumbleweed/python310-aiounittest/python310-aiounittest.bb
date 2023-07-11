SUMMARY = "Test AyncIO Python Code Easily"
DESCRIPTION = "This is a helper library to ease of your pain (and boilerplate), when writing a \
test of the asynchronous code (asyncio). You can test: \
 \
* synchronous code (same as the unittest.TestCase) \
* asynchronous code, it supports syntax with async/await (Python 3.5+) and \
  asyncio.coroutine/yield from (Python 3.4)"
LICENSE = "MIT"

PV = "1.4.2"

RPM_NAME = "python310-aiounittest-1.4.2-2.3.noarch.rpm"
RPM_HASH = "a827509711041277b313524f181cfa1517c10bd1170aa21d5db3575a0934840a168cf6a8e048d637dc78f238c7132c40d546c332e39c0252d046cb6fe366763c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-aiounittest \
python310-aiounittest \
python3dist-aiounittest"

RDEPENDS:${PN} += "python-abi \
python310-wrapt"

inherit rpm
