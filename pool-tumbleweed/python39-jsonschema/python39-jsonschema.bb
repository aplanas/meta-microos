SUMMARY = "An implementation of JSON-Schema validation for Python"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python \
The validator can be used as python module and from console: \
 \
    $ jsonschema --instance sample.json sample.schema"
LICENSE = "MIT"

PV = "4.18.6"

RPM_NAME = "python39-jsonschema-4.18.6-1.1.noarch.rpm"
RPM_HASH = "1d5e0c37214d767e12bc18d4539a2870d4e4a35e3ef69ce3eb79682ed4c09060822d8a86a7438992f3c094fb92315b9dbdc3b31ea022914be4d1b54913c0ceb2"
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
