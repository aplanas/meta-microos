SUMMARY = "An implementation of JSON-Schema validation for Python"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python \
The validator can be used as python module and from console: \
 \
    $ jsonschema --instance sample.json sample.schema"
LICENSE = "MIT"

PV = "4.18.3"

RPM_NAME = "python311-jsonschema-4.18.3-1.1.noarch.rpm"
RPM_HASH = "fcff7b662c93880725ff15e4c3490c41682b931157b98a299008b9e7f57b12b464aed56d8db2e9b0ef92dac8541452be1b7326ce5c8c86d1ea4d9e86fc73b451"
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
