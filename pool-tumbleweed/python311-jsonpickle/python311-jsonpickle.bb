SUMMARY = "Python library for serializing any arbitrary object graph into JSON"
DESCRIPTION = "Python library for serializing any arbitrary object graph into JSON. \
It can take almost any Python object and turn the object into JSON. \
Additionally, it can reconstitute the object back into Python."
LICENSE = "BSD-3-Clause"

PV = "3.0.1"

RPM_NAME = "python311-jsonpickle-3.0.1-2.1.noarch.rpm"
RPM_HASH = "4e51a4b31fb698ff79f7251e97ca02a2e8a0802b3f11dbce27136189722fcaf4a8ba0a17729782a0c8b1365945261d5463d5f20b502ec20d1e47a293186f3ab3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsonpickle \
python3.11dist-jsonpickle \
python311-jsonpickle \
python3dist-jsonpickle"

RDEPENDS:${PN} += "python-abi"

inherit rpm
