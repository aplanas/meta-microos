SUMMARY = "JSONPath for Python"
DESCRIPTION = "A final implementation of JSONPath for Python that aims to be \
standard compliant, including arithmetic and binary comparison \
operators and providing clear AST for metaprogramming."
LICENSE = "Apache-2.0"

PV = "1.5.2"

RPM_NAME = "python311-jsonpath-ng-1.5.2-1.10.noarch.rpm"
RPM_HASH = "6670c169e0100707598dc35651e702c0011ba98c7b8e4b5a7f67e64b403e71309d0e7662cb202b276af6ba936d101b3a07e1473f5813d14eae98f1fcdfd2577f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsonpath-ng \
python3.11dist-jsonpath-ng \
python311-jsonpath-ng \
python3dist-jsonpath-ng"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-decorator \
python311-ply \
python311-six"

inherit rpm
