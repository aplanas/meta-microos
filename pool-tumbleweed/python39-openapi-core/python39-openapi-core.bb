SUMMARY = "Client- and server-side support for the OpenAPI Specification v3"
DESCRIPTION = "Openapi-core is a Python library that adds client-side \
and server-side support for the OpenAPI Specification \
v3.0.0."
LICENSE = "BSD-3-Clause"

PV = "0.16.6"

RPM_NAME = "python39-openapi-core-0.16.6-1.1.noarch.rpm"
RPM_HASH = "2beb5a4b33eb1e447bb29766e4732ea6c3d16ea76a83eaffec70bd8bc6c48a0b8622794dcdd647b83c88d7435fb3de09d9534d13560709a35fb1c8789016406a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-openapi-core \
python39-openapi-core \
python3dist-openapi-core"

RDEPENDS:${PN} += "-python39-openapi-schema-validator >= 0.3.0 with python39-openapi-schema-validator < 0.5 \
-python39-openapi-spec-validator >= 0.5.0 with python39-openapi-spec-validator < 0.6 \
python-abi \
python39-Werkzeug \
python39-isodate \
python39-jsonschema-spec \
python39-more-itertools \
python39-parse \
python39-pathable \
python39-typing-extensions"

inherit rpm
