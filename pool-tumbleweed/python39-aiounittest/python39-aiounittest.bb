SUMMARY = "Test AyncIO Python Code Easily"
DESCRIPTION = "This is a helper library to ease of your pain (and boilerplate), when writing a \
test of the asynchronous code (asyncio). You can test: \
 \
* synchronous code (same as the unittest.TestCase) \
* asynchronous code, it supports syntax with async/await (Python 3.5+) and \
  asyncio.coroutine/yield from (Python 3.4)"
LICENSE = "MIT"

PV = "1.4.2"

RPM_NAME = "python39-aiounittest-1.4.2-2.3.noarch.rpm"
RPM_HASH = "4fe11580cdec2b6e7ffc28554dae5d4ad7ee0b605c77c7ce873abeb9bb75b94650eefade3b720853ba6a56043151b0069b57b5ffebafd022a359eb548e1c4b37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-aiounittest \
python39-aiounittest \
python3dist-aiounittest"

RDEPENDS:${PN} += "python-abi \
python39-wrapt"

inherit rpm
