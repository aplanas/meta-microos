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

RPM_NAME = "python311-pytest-attrib-0.1.3-3.33.noarch.rpm"
RPM_HASH = "dfb3a02eff5afa1f296a99ccc7884e5638773d5dd0fe8d67fd854d5ac34a6b81a26ab47f3858ca96416db99b09f85314240abe8e5fea776be93bd2938ab2da26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pytest-attrib \
python311-pytest-attrib \
python3dist-pytest-attrib"

RDEPENDS:${PN} += "python-abi \
python311-pytest"

inherit rpm
