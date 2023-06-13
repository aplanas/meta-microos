SUMMARY = "Testing support by jaraco"
DESCRIPTION = "Testing support by jaraco"
LICENSE = "MIT"

PV = "5.3.0"

RPM_NAME = "python39-jaraco.test-5.3.0-1.1.noarch.rpm"
RPM_HASH = "d62cea2d04f7433b274fc95987cbac8cfcf9d80b82a3c93eb9849770333fff55353373c1eb1fddd1636693bb35bb729af85a0bfa4013d0ee65e2af3aff6f8cb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jaraco.test) \
python39-jaraco.test \
python3dist(jaraco.test)"

RDEPENDS:${PN} += "python(abi) \
python39-jaraco.context \
python39-jaraco.functools"

inherit rpm
