SUMMARY = "Pytest Plugin for Twisted"
DESCRIPTION = "pytest-twisted is a plugin for pytest, which allows to test code, \
which uses the twisted framework. test functions can return Deferred \
objects and pytest will wait for their completion with this plugin."
LICENSE = "BSD-2-Clause"

PV = "1.14.0"

RPM_NAME = "python310-pytest-twisted-1.14.0-1.3.noarch.rpm"
RPM_HASH = "2ea1f49d49a8f868ecea9929cc16b08a38b33e2e21feb9d3e55d7478f7783a89de60a2598e1bf9039251be3240e762eac2bf6d123383c20d6331368913170d78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-twisted \
python310-pytest-twisted \
python3dist-pytest-twisted"

RDEPENDS:${PN} += "python-abi \
python310-Twisted \
python310-decorator \
python310-greenlet \
python310-pytest"

inherit rpm
