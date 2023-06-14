SUMMARY = "An implementation of JSON-Schema validation for Python"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python \
The validator can be used as python module and from console: \
 \
    $ jsonschema --instance sample.json sample.schema"
LICENSE = "MIT"

PV = "4.17.3"

RPM_NAME = "python310-jsonschema-4.17.3-3.1.noarch.rpm"
RPM_HASH = "9997b2bc22ba90a5dff362c2c3c5cbc257fe629a60a30dc52f91460e2c597bea6239dd35d1ad29e0ddeab1be5020f316ac0490d9d3a62f2aea17fdc8c77d0665"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsonschema \
python3.10dist-jsonschema \
python310-jsonschema \
python3dist-jsonschema"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
alts \
python-abi \
python310-attrs \
python310-pyrsistent"

inherit rpm
