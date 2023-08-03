SUMMARY = "Client- and server-side support for the OpenAPI Specification v3"
DESCRIPTION = "Openapi-core is a Python library that adds client-side \
and server-side support for the OpenAPI Specification \
v3.0.0."
LICENSE = "BSD-3-Clause"

PV = "0.18.0"

RPM_NAME = "python310-openapi-core-0.18.0-2.1.noarch.rpm"
RPM_HASH = "2744d9568e09630e4d69f6f63df7d9f8ce16bfab85fcb1db61d79ab1bfd6aa53e46ca6bf1b5cf980dc9032e438d485a81d269b6bcc8ab7ff71e67520b491789d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-openapi-core \
python310-openapi-core \
python3dist-openapi-core"

RDEPENDS:${PN} += "-python310-jsonschema >= 4.18.0 with python310-jsonschema < 5 \
-python310-jsonschema-spec >= 0.2.3 with python310-jsonschema-spec < 0.3 \
-python310-openapi-schema-validator >= 0.6 with python310-openapi-schema-validator < 0.7 \
-python310-openapi-spec-validator >= 0.6 with python310-openapi-spec-validator < 0.7 \
python-abi \
python310-Werkzeug \
python310-asgiref \
python310-isodate \
python310-more-itertools \
python310-openapi-schema-validator \
python310-openapi-spec-validator \
python310-parse"

inherit rpm
