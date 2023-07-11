SUMMARY = "Python library for serializing any arbitrary object graph into JSON"
DESCRIPTION = "Python library for serializing any arbitrary object graph into JSON. \
It can take almost any Python object and turn the object into JSON. \
Additionally, it can reconstitute the object back into Python."
LICENSE = "BSD-3-Clause"

PV = "3.0.1"

RPM_NAME = "python310-jsonpickle-3.0.1-2.1.noarch.rpm"
RPM_HASH = "1026eb602a298bff1e062c34e1d0670be84adf4e62fcc395ac6476cc6d90934e684e52fd0171a2e657b1c7a0efd1fc1cd5440b314c09cdd5b7b31ff8d6772b44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jsonpickle \
python310-jsonpickle \
python3dist-jsonpickle"

RDEPENDS:${PN} += "python-abi"

inherit rpm
