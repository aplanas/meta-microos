SUMMARY = "An implementation of JSON-Schema validation for Python"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python \
The validator can be used as python module and from console: \
 \
    $ jsonschema --instance sample.json sample.schema"
LICENSE = "MIT"

PV = "4.18.4"

RPM_NAME = "python310-jsonschema-4.18.4-1.2.noarch.rpm"
RPM_HASH = "cc887df142cfbc9f9e91b9ded12dd3c676a4660f899f01dfef5d0f0caef2d109d5aa2b92c7932b7d8b02ded3b09117ddacb20f7fbb8bb4f956487979d290408f"
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
