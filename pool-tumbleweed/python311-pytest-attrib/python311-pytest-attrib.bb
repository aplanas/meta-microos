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

RPM_NAME = "python311-pytest-attrib-0.1.3-3.35.noarch.rpm"
RPM_HASH = "a8b5514090e32c539aa793714a64fb289e76ae81c21fe227781783310964e1bfbc01cbd5c25596678f5f81e768d7a2630106764d77d079764f3562da8e74c2e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-attrib \
python3.11dist-pytest-attrib \
python311-pytest-attrib \
python3dist-pytest-attrib"

RDEPENDS:${PN} += "python-abi \
python311-pytest"

inherit rpm
