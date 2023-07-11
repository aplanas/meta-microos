SUMMARY = "Pytest Plugin for Twisted"
DESCRIPTION = "pytest-twisted is a plugin for pytest, which allows to test code, \
which uses the twisted framework. test functions can return Deferred \
objects and pytest will wait for their completion with this plugin."
LICENSE = "BSD-2-Clause"

PV = "1.14.0"

RPM_NAME = "python311-pytest-twisted-1.14.0-1.3.noarch.rpm"
RPM_HASH = "64ad1f5a817e743613c7fd66edbf9362ab104b7699021c56ba7facb5c04966c99b28e24d39c63cdd2ac0ad1399ade096cc9677c614dba9cb7fef9ffe9a4d7061"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-twisted \
python3.11dist-pytest-twisted \
python311-pytest-twisted \
python3dist-pytest-twisted"

RDEPENDS:${PN} += "python-abi \
python311-Twisted \
python311-decorator \
python311-greenlet \
python311-pytest"

inherit rpm
