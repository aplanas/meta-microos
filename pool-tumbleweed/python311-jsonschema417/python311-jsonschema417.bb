SUMMARY = "An implementation of JSON-Schema validation for Python"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python \
The validator can be used as python module and from console: \
 \
    $ jsonschema --instance sample.json sample.schema"
LICENSE = "MIT"

PV = "4.17.3"

RPM_NAME = "python311-jsonschema417-4.17.3-1.1.noarch.rpm"
RPM_HASH = "3f29b4c8fb053de68192264e9bf75acc849799c8a3fde7fd9f913dc4d04a772aadcc6ef3b2216af8a3ae1a7a1c1757b0fa99ea1562fc7a72fd5f9a80ff54047b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsonschema \
python3-jsonschema417 \
python3.11dist-jsonschema \
python311-jsonschema \
python311-jsonschema417 \
python3dist-jsonschema"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
python-abi \
python311-attrs \
python311-pyrsistent"

inherit rpm
