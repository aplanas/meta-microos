SUMMARY = "Python library for serializing any arbitrary object graph into JSON"
DESCRIPTION = "Python library for serializing any arbitrary object graph into JSON. \
It can take almost any Python object and turn the object into JSON. \
Additionally, it can reconstitute the object back into Python."
LICENSE = "BSD-3-Clause"

PV = "3.0.1"

RPM_NAME = "python39-jsonpickle-3.0.1-1.3.noarch.rpm"
RPM_HASH = "b09ad963895fa64fb33fcbc9096a35e58a046a1dcbe94f528aed73e7daf76cb2d2aaa4b8fe87f41f4e3c0acbf5ebed210e16fea23eab913da51dc4b46e527e1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jsonpickle) \
python39-jsonpickle \
python3dist(jsonpickle)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
