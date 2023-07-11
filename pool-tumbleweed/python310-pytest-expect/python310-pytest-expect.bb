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

RPM_NAME = "python310-pytest-expect-1.1.0-4.2.noarch.rpm"
RPM_HASH = "296de90e69896b7f317d47cf111f9beff3a78fcf832cc4966d5d1925135b8d01e29b34695d189db3c6a0b446ba4dae2b900ad9b37c516223409b41dfea6bc2d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-expect \
python310-pytest-expect \
python3dist-pytest-expect"

RDEPENDS:${PN} += "python-abi \
python310-pytest \
python310-six \
python310-u-msgpack-python"

inherit rpm
