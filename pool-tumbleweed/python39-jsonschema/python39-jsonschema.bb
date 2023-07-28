SUMMARY = "An implementation of JSON-Schema validation for Python"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python \
The validator can be used as python module and from console: \
 \
    $ jsonschema --instance sample.json sample.schema"
LICENSE = "MIT"

PV = "4.18.4"

RPM_NAME = "python39-jsonschema-4.18.4-1.2.noarch.rpm"
RPM_HASH = "4fc883bf4227931f33fd0b39a2fdb110e9e45dc6710fa516b8ed8cd7d6d666382ee355253c3b0ae3f457affa2822aa094c4d64e9cfb282f46746bee637ace891"
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
