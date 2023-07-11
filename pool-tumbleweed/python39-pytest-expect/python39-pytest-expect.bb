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

RPM_NAME = "python39-pytest-expect-1.1.0-4.2.noarch.rpm"
RPM_HASH = "a93ac06b3d5aa61a6d7b1c655fa51a4aafebefb891e48919ce7eb0e4ded063103f7ac6af0c952c84026fb4eace0d18c88fda9808b687e3653c86204522c03b92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-expect \
python39-pytest-expect \
python3dist-pytest-expect"

RDEPENDS:${PN} += "python-abi \
python39-pytest \
python39-six \
python39-u-msgpack-python"

inherit rpm
