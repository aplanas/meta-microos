SUMMARY = "Client- and server-side support for the OpenAPI Specification v3"
DESCRIPTION = "Openapi-core is a Python library that adds client-side \
and server-side support for the OpenAPI Specification \
v3.0.0."
LICENSE = "BSD-3-Clause"

PV = "0.16.6"

RPM_NAME = "python310-openapi-core-0.16.6-1.1.noarch.rpm"
RPM_HASH = "5933dc13c9240a6051a43f68ba35c9c9b1e699b8841bb1457bf15e6a6a37fb672b3a355a0871b661f8e35faca9b3305c805afbdeaac8d5746b253e91c2d03a17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-openapi-core \
python310-openapi-core \
python3dist-openapi-core"

RDEPENDS:${PN} += "-python310-openapi-schema-validator >= 0.3.0 with python310-openapi-schema-validator < 0.5 \
-python310-openapi-spec-validator >= 0.5.0 with python310-openapi-spec-validator < 0.6 \
python-abi \
python310-Werkzeug \
python310-isodate \
python310-jsonschema-spec \
python310-more-itertools \
python310-parse \
python310-pathable \
python310-typing-extensions"

inherit rpm
