SUMMARY = "JSONPath for Python"
DESCRIPTION = "A final implementation of JSONPath for Python that aims to be \
standard compliant, including arithmetic and binary comparison \
operators and providing clear AST for metaprogramming."
LICENSE = "Apache-2.0"

PV = "1.5.2"

RPM_NAME = "python39-jsonpath-ng-1.5.2-1.10.noarch.rpm"
RPM_HASH = "a31dffdba930b4bc53a30cd703488003a6cd7addd3c628f374ea5fd27d74f4ddd4eacb84f76679786ed79f3f8244982fe6a9389982a7838c8975906ad31e31b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jsonpath-ng \
python39-jsonpath-ng \
python3dist-jsonpath-ng"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-decorator \
python39-ply \
python39-six"

inherit rpm
