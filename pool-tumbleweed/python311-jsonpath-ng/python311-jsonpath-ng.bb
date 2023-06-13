SUMMARY = "JSONPath for Python"
DESCRIPTION = "A final implementation of JSONPath for Python that aims to be \
standard compliant, including arithmetic and binary comparison \
operators and providing clear AST for metaprogramming."
LICENSE = "Apache-2.0"

PV = "1.5.2"

RPM_NAME = "python311-jsonpath-ng-1.5.2-1.9.noarch.rpm"
RPM_HASH = "5955006108d5939c548f4300bf68f3edc9fe062d2424a28921d15edf5f3240638aa8371c8d85e548d5b3bdac0e639b3170d0465d6a5054ae3974906da31d5e01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jsonpath-ng) \
python311-jsonpath-ng \
python3dist(jsonpath-ng)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-decorator \
python311-ply \
python311-six"

inherit rpm
