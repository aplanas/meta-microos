SUMMARY = "Client- and server-side support for the OpenAPI Specification v3"
DESCRIPTION = "Openapi-core is a Python library that adds client-side \
and server-side support for the OpenAPI Specification \
v3.0.0."
LICENSE = "BSD-3-Clause"

PV = "0.18.0"

RPM_NAME = "python39-openapi-core-0.18.0-2.1.noarch.rpm"
RPM_HASH = "b4cb44c328e89c4207aecc418a795332e4612b6ff64313f5d8962148717726e264ac62a2d1be6a8a00ac1cba108befe366ede7db3364cc7ea01113f5eb356191"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-openapi-core \
python39-openapi-core \
python3dist-openapi-core"

RDEPENDS:${PN} += "-python39-jsonschema >= 4.18.0 with python39-jsonschema < 5 \
-python39-jsonschema-spec >= 0.2.3 with python39-jsonschema-spec < 0.3 \
-python39-openapi-schema-validator >= 0.6 with python39-openapi-schema-validator < 0.7 \
-python39-openapi-spec-validator >= 0.6 with python39-openapi-spec-validator < 0.7 \
python-abi \
python39-Werkzeug \
python39-asgiref \
python39-isodate \
python39-more-itertools \
python39-openapi-schema-validator \
python39-openapi-spec-validator \
python39-parse"

inherit rpm
