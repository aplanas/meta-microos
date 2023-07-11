SUMMARY = "An implementation of JSON-Schema validation for Python"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python \
The validator can be used as python module and from console: \
 \
    $ jsonschema --instance sample.json sample.schema"
LICENSE = "MIT"

PV = "4.18.0"

RPM_NAME = "python311-jsonschema-4.18.0-1.1.noarch.rpm"
RPM_HASH = "71f91347f65370354a434180d5d7200cf0024d6cced6a3b86f91c89d89807bd042df95515ef753f5055dcef145ca39c6bb5b068fbf043de9f8bc375b68465dec"
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
