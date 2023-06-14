SUMMARY = "Pytest Plugin for Twisted"
DESCRIPTION = "pytest-twisted is a plugin for pytest, which allows to test code, \
which uses the twisted framework. test functions can return Deferred \
objects and pytest will wait for their completion with this plugin."
LICENSE = "BSD-2-Clause"

PV = "1.14.0"

RPM_NAME = "python39-pytest-twisted-1.14.0-1.1.noarch.rpm"
RPM_HASH = "e7e24aee25fbffc0f5d10b44058a53a9f92af74bc351ecc642c225f30ceebd310e4754d5b3c92df0c363cf7dca95f98cfbb5859b5e5d634119d7afc30be0877e"
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
