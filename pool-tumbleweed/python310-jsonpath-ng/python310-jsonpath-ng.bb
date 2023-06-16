SUMMARY = "JSONPath for Python"
DESCRIPTION = "A final implementation of JSONPath for Python that aims to be \
standard compliant, including arithmetic and binary comparison \
operators and providing clear AST for metaprogramming."
LICENSE = "Apache-2.0"

PV = "1.5.2"

RPM_NAME = "python310-jsonpath-ng-1.5.2-1.9.noarch.rpm"
RPM_HASH = "a8eb42c182d3daaa0bd0f26ecc0c4b697f97d924570b6f195d0315cc7410d573209ac29d11fe1f054921c698873880a3edcd17fbc5b9b01d22066536310d3350"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsonpath-ng \
python3.10dist-jsonpath-ng \
python310-jsonpath-ng \
python3dist-jsonpath-ng"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-decorator \
python310-ply \
python310-six"

inherit rpm
