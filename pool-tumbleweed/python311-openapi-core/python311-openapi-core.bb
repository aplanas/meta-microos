SUMMARY = "Client- and server-side support for the OpenAPI Specification v3"
DESCRIPTION = "Openapi-core is a Python library that adds client-side \
and server-side support for the OpenAPI Specification \
v3.0.0."
LICENSE = "BSD-3-Clause"

PV = "0.16.6"

RPM_NAME = "python311-openapi-core-0.16.6-1.1.noarch.rpm"
RPM_HASH = "1c6d7cd103f839a1124496d268a007e59e0dd84bd35ce093bc155ae9cdb116c16ebcde129e0ca41626c35bb0b0d0bcb124ed4fe0e4f6f13ceb21acddd0d5ad4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-openapi-core \
python3.11dist-openapi-core \
python311-openapi-core \
python3dist-openapi-core"

RDEPENDS:${PN} += "-python311-openapi-schema-validator >= 0.3.0 with python311-openapi-schema-validator < 0.5 \
-python311-openapi-spec-validator >= 0.5.0 with python311-openapi-spec-validator < 0.6 \
python-abi \
python311-Werkzeug \
python311-isodate \
python311-jsonschema-spec \
python311-more-itertools \
python311-parse \
python311-pathable \
python311-typing-extensions"

inherit rpm
