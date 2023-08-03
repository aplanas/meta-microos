SUMMARY = "Client- and server-side support for the OpenAPI Specification v3"
DESCRIPTION = "Openapi-core is a Python library that adds client-side \
and server-side support for the OpenAPI Specification \
v3.0.0."
LICENSE = "BSD-3-Clause"

PV = "0.18.0"

RPM_NAME = "python311-openapi-core-0.18.0-2.1.noarch.rpm"
RPM_HASH = "c8485638c6ddeac881c3edbf014af770bc802e1c0b2c133cb39017ebac1fb7a836ffffd0f217cf5f5d5437aad0cf315ee4c085486138255a6407dcad2f861e77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-openapi-core \
python3.11dist-openapi-core \
python311-openapi-core \
python3dist-openapi-core"

RDEPENDS:${PN} += "-python311-jsonschema >= 4.18.0 with python311-jsonschema < 5 \
-python311-jsonschema-spec >= 0.2.3 with python311-jsonschema-spec < 0.3 \
-python311-openapi-schema-validator >= 0.6 with python311-openapi-schema-validator < 0.7 \
-python311-openapi-spec-validator >= 0.6 with python311-openapi-spec-validator < 0.7 \
python-abi \
python311-Werkzeug \
python311-asgiref \
python311-isodate \
python311-more-itertools \
python311-openapi-schema-validator \
python311-openapi-spec-validator \
python311-parse"

inherit rpm
