SUMMARY = "Python library for serializing any arbitrary object graph into JSON"
DESCRIPTION = "Python library for serializing any arbitrary object graph into JSON. \
It can take almost any Python object and turn the object into JSON. \
Additionally, it can reconstitute the object back into Python."
LICENSE = "BSD-3-Clause"

PV = "3.0.1"

RPM_NAME = "python311-jsonpickle-3.0.1-1.3.noarch.rpm"
RPM_HASH = "2644ed4988fee833b65ee53c992e7cd37f48793be29e7af0d5d432d5e0692e43a5af10d195af3fcf6c1e52176e1b3b9652eaaee27fdd25127b462a0c136d6a22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-jsonpickle \
python311-jsonpickle \
python3dist-jsonpickle"

RDEPENDS:${PN} += "python-abi"

inherit rpm
