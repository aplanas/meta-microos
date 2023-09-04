SUMMARY = "An implementation of JSON-Schema validation for Python"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python \
The validator can be used as python module and from console: \
 \
    $ jsonschema --instance sample.json sample.schema"
LICENSE = "MIT"

PV = "4.18.6"

RPM_NAME = "python311-jsonschema-4.18.6-1.1.noarch.rpm"
RPM_HASH = "659deffe55f909a300063e2c3831b426f9114e69e469eb92a5ad98636210d5427f1ae298861c421241fe75d9406d4802952bb259003ffd38dea00dffefdeff30"
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
