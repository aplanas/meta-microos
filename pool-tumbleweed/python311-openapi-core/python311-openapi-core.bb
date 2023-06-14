SUMMARY = "Client- and server-side support for the OpenAPI Specification v3"
DESCRIPTION = "Openapi-core is a Python library that adds client-side \
and server-side support for the OpenAPI Specification \
v3.0.0."
LICENSE = "BSD-3-Clause"

PV = "0.16.1"

RPM_NAME = "python311-openapi-core-0.16.1-1.3.noarch.rpm"
RPM_HASH = "1778520e9da956c4d1f8869554175ddd38a1514b5f3d6e9a17c067352d7f8b9811b0671e93c55f4e5e058ec45ef507d6fa477cd667b70b4252fcc9742b3c6c55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-openapi-core \
python311-openapi-core \
python3dist-openapi-core"

RDEPENDS:${PN} += "python-abi \
python311-Werkzeug \
python311-isodate \
python311-jsonschema-spec \
python311-more-itertools \
python311-openapi-schema-validator \
python311-openapi-spec-validator \
python311-parse \
python311-pathable \
python311-typing-extensions"

inherit rpm
