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

RPM_NAME = "python310-pytest-attrib-0.1.3-3.33.noarch.rpm"
RPM_HASH = "ee7678cdd9acfc6179c76f5b4da26f459f5eef735be85ac5802f6db7fe4bc1e25db4bf26440bd780c8329d6209db95572531a076ad59dd836adb61e579582f24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-attrib \
python3.10dist(pytest-attrib) \
python310-pytest-attrib \
python3dist(pytest-attrib)"

RDEPENDS:${PN} += "python(abi) \
python310-pytest"

inherit rpm
