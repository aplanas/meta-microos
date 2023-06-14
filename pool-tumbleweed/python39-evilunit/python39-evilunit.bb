SUMMARY = "Python unittest helpers"
DESCRIPTION = "evilunit provides helpers for Python unittest, \
including class level imports, parameterized tests \
and nested test classes."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python39-evilunit-0.2.1-1.12.noarch.rpm"
RPM_HASH = "f1b51a99eeccdfcafd2156d271872998115233eed3543f59bd0c7f6c0bd571ad129cd8a6541341757a55ab8522874d62418add7c50f79e2f89c85abf40b5c590"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-evilunit \
python39-evilunit \
python3dist-evilunit"

RDEPENDS:${PN} += "python-abi \
python39-setuptools"

inherit rpm
