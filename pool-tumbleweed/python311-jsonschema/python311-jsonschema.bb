SUMMARY = "An implementation of JSON-Schema validation for Python"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python \
The validator can be used as python module and from console: \
 \
    $ jsonschema --instance sample.json sample.schema"
LICENSE = "MIT"

PV = "4.18.6"

RPM_NAME = "python311-jsonschema-4.18.6-2.1.noarch.rpm"
RPM_HASH = "7823c1c9ec5f8abbc1860ab444cf6b991584eae6c94903db9fc0a8d3e2d35127e0abaeb151345deaf2b874129cf139ba039a60441a9f2fafe16e941ca58a2197"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsonschema \
python3.11dist-jsonschema \
python311-jsonschema \
python3dist-jsonschema"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
python-abi \
python311-attrs \
python311-jsonschema-specifications \
python311-pyrsistent \
python311-referencing \
python311-rpds-py"

inherit rpm
