SUMMARY = "Pytest Plugin for Twisted"
DESCRIPTION = "pytest-twisted is a plugin for pytest, which allows to test code, \
which uses the twisted framework. test functions can return Deferred \
objects and pytest will wait for their completion with this plugin."
LICENSE = "BSD-2-Clause"

PV = "1.14.0"

RPM_NAME = "python39-pytest-twisted-1.14.0-1.3.noarch.rpm"
RPM_HASH = "e8853e6affb6bc0d9fef6d9830374162b1f4e13494588102de39e1fa79df565d145cd6668f6736bdafa838a79191abbd346fc3a267efab0283fa32b459a8ab64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-twisted \
python39-pytest-twisted \
python3dist-pytest-twisted"

RDEPENDS:${PN} += "python-abi \
python39-Twisted \
python39-decorator \
python39-greenlet \
python39-pytest"

inherit rpm
