SUMMARY = "An implementation of JSON-Schema validation for Python"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python \
The validator can be used as python module and from console: \
 \
    $ jsonschema --instance sample.json sample.schema"
LICENSE = "MIT"

PV = "4.18.6"

RPM_NAME = "python310-jsonschema-4.18.6-2.1.noarch.rpm"
RPM_HASH = "9dada49354b7b7a1f01440e9671499d6f65c71f0ec5b6b3489dc5440cf64822be0643705d6f34ceeef493e0eb4d79b5cb9ed8ebdd16df4166536b50e533e20f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jsonschema \
python310-jsonschema \
python3dist-jsonschema"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
python-abi \
python310-attrs \
python310-jsonschema-specifications \
python310-pyrsistent \
python310-referencing \
python310-rpds-py"

inherit rpm
