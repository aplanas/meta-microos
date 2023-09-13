SUMMARY = "An implementation of JSON-Schema validation for Python"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python \
The validator can be used as python module and from console: \
 \
    $ jsonschema --instance sample.json sample.schema"
LICENSE = "MIT"

PV = "4.18.6"

RPM_NAME = "python39-jsonschema-4.18.6-2.1.noarch.rpm"
RPM_HASH = "99806ca64a718eb6f6d98e0af5dbfe89354d6e4ce7a5d605b09f9232f72ecea5b22083c6a4e3b61897faad9b66f9ac5f497ac3fc5b44ce12fdeba20bbac43eab"
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
