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

RPM_NAME = "python39-pytest-attrib-0.1.3-3.35.noarch.rpm"
RPM_HASH = "381505935f976a6a2b1815bda3b83eef4d644ef8b687351ca478c601ec65707ab5d5fc576ef2b1093e64e1532e4cf36b1914f2777418d8f4bcacc8ed738274bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-attrib \
python39-pytest-attrib \
python3dist-pytest-attrib"

RDEPENDS:${PN} += "python-abi \
python39-pytest"

inherit rpm
