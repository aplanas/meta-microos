SUMMARY = "Py.test plugin to store test expectations and mark tests based on them"
DESCRIPTION = "A py.test plugin that stores test expectations by saving the set of \
failing tests, allowing them to be marked as xfail when running them \
in future. The tests expectations are stored such that they can be \
distributed alongside the tests. However, note that test expectations \
can only be reliably shared between Python 2 and Python 3 if they only \
use ASCII characters in their node ids: this likely isn’t a limitation \
if tests are using the normal Python format, as Python 2 only allows \
ASCII characters in identifiers."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-pytest-expect-1.1.0-4.2.noarch.rpm"
RPM_HASH = "3b0387de0dd4f200bababf420e5b36e26fb9e9748f51205a09456b74cad884098c6bbd813a5b3f4d77d89032bdd09eeea900222018629e4bf755eccd8e3f2592"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-expect \
python3.11dist-pytest-expect \
python311-pytest-expect \
python3dist-pytest-expect"

RDEPENDS:${PN} += "python-abi \
python311-pytest \
python311-six \
python311-u-msgpack-python"

inherit rpm
