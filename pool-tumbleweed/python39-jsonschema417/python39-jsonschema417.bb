SUMMARY = "An implementation of JSON-Schema validation for Python"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python \
The validator can be used as python module and from console: \
 \
    $ jsonschema --instance sample.json sample.schema"
LICENSE = "MIT"

PV = "4.17.3"

RPM_NAME = "python39-jsonschema417-4.17.3-1.1.noarch.rpm"
RPM_HASH = "c93d418c8cb751c2224ac8a373a434b4b5f52d283dd8d894fa284cf307d8fa0ce55d5d7685a994f6a057285916d0e6585887a0d9c058b3f1eba64d1c9f341eea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jsonschema \
python39-jsonschema \
python39-jsonschema417 \
python3dist-jsonschema"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
alts \
python-abi \
python39-attrs \
python39-pyrsistent"

inherit rpm
