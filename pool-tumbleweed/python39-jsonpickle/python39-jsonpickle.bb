SUMMARY = "Python library for serializing any arbitrary object graph into JSON"
DESCRIPTION = "Python library for serializing any arbitrary object graph into JSON. \
It can take almost any Python object and turn the object into JSON. \
Additionally, it can reconstitute the object back into Python."
LICENSE = "BSD-3-Clause"

PV = "3.0.1"

RPM_NAME = "python39-jsonpickle-3.0.1-2.1.noarch.rpm"
RPM_HASH = "0bb6c043214d5895ecad9870c40e6c212728c4bc8bdcf9a12847ef5e9f2f5c5fc49fe6f4b2c313fffe9fd6130c1f5bd71f1a1ea8e9ab0c360852e67f726bdb1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jsonpickle \
python39-jsonpickle \
python3dist-jsonpickle"

RDEPENDS:${PN} += "python-abi"

inherit rpm
