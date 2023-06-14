SUMMARY = "Pytest Plugin for Twisted"
DESCRIPTION = "pytest-twisted is a plugin for pytest, which allows to test code, \
which uses the twisted framework. test functions can return Deferred \
objects and pytest will wait for their completion with this plugin."
LICENSE = "BSD-2-Clause"

PV = "1.14.0"

RPM_NAME = "python311-pytest-twisted-1.14.0-1.1.noarch.rpm"
RPM_HASH = "75a7dcb046f7bf64c878f62e91c24eade15794603a7e0efeab210c14dab5056e2f85639223263a7f3038ed0bbd296a588b86d71d90e828769d8ec191c2b440c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pytest-twisted \
python311-pytest-twisted \
python3dist-pytest-twisted"

RDEPENDS:${PN} += "python-abi \
python311-Twisted \
python311-decorator \
python311-greenlet \
python311-pytest"

inherit rpm
