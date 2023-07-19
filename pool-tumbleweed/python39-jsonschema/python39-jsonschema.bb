SUMMARY = "An implementation of JSON-Schema validation for Python"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python \
The validator can be used as python module and from console: \
 \
    $ jsonschema --instance sample.json sample.schema"
LICENSE = "MIT"

PV = "4.18.3"

RPM_NAME = "python39-jsonschema-4.18.3-1.1.noarch.rpm"
RPM_HASH = "4cb9af6f7a4a24ed3e99f81035ebbefeb49458791eb998b76ad4c088b6c0e9c5b252e4930e9df3435f42391f9204d98c4aada6bbd102382153cf1cc007948077"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jsonschema \
python39-jsonschema \
python3dist-jsonschema"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
alts \
python-abi \
python39-attrs \
python39-jsonschema-specifications \
python39-pyrsistent \
python39-referencing \
python39-rpds-py"

inherit rpm
