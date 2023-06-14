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

RPM_NAME = "python310-pytest-expect-1.1.0-4.1.noarch.rpm"
RPM_HASH = "a9f73a0eb98d75a0e76115c2f1a9b61141eff03bff904b8604c1b12c82b89ddb25c501990b1482309e1bcfe4a054a01c47ade25defbd13ed30a82b2a54825076"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-expect \
python3.10dist-pytest-expect \
python310-pytest-expect \
python3dist-pytest-expect"

RDEPENDS:${PN} += "python-abi \
python310-pytest \
python310-six \
python310-u-msgpack-python"

inherit rpm
