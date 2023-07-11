SUMMARY = "Pytest plugin to select tests based on attributes"
DESCRIPTION = "The pytest-attrib plugin extends py.test with the ability to select tests \
based on a criteria rather than just the filename or pytest.marks. For \
example, you might want to run only tests that need internet connectivity, \
or tests that are slow. \
 \
The pytest.mark  plugin already provides a featrure to mark tests and run \
only the marked tests. This plugin also allows to run expressions on the \
attributes of the class, and does not require the pytest.mark decorator. \
 \
It offers features similar to the nose plugin nose-attrib."
LICENSE = "MIT"

PV = "0.1.3"

RPM_NAME = "python310-pytest-attrib-0.1.3-3.35.noarch.rpm"
RPM_HASH = "17bd744043df6513d4a6ba8a70f252b4fc476d6d423de1522ec7420819e74bcc4d1abc42db0d53f94d710a65b594cf946fedae68a478adb927483d883192b9a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-attrib \
python310-pytest-attrib \
python3dist-pytest-attrib"

RDEPENDS:${PN} += "python-abi \
python310-pytest"

inherit rpm
