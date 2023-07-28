SUMMARY = "An implementation of JSON-Schema validation for Python"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python \
The validator can be used as python module and from console: \
 \
    $ jsonschema --instance sample.json sample.schema"
LICENSE = "MIT"

PV = "4.18.4"

RPM_NAME = "python311-jsonschema-4.18.4-1.2.noarch.rpm"
RPM_HASH = "349e3602143f2fa313391d7f5fdc26d48a7312e83d19d440f850c24e50167d4b3cd91ac6256bb060db3028ff8ce2d0ec3bc0c93dda6ac0c751bb6ebc620b2d15"
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
