SUMMARY = "JSONPath for Python"
DESCRIPTION = "A final implementation of JSONPath for Python that aims to be \
standard compliant, including arithmetic and binary comparison \
operators and providing clear AST for metaprogramming."
LICENSE = "Apache-2.0"

PV = "1.5.2"

RPM_NAME = "python310-jsonpath-ng-1.5.2-1.10.noarch.rpm"
RPM_HASH = "f1a7d40772e1e112e2039d11d5c7941af8140c39d1bcedc4865599ff39b035f7aeb0df71dae2208e2cf1bac813e0deb870081c9037101b38f6351514b3ba16b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jsonpath-ng \
python310-jsonpath-ng \
python3dist-jsonpath-ng"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-decorator \
python310-ply \
python310-six"

inherit rpm
