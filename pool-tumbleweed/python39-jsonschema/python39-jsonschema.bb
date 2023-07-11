SUMMARY = "An implementation of JSON-Schema validation for Python"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python \
The validator can be used as python module and from console: \
 \
    $ jsonschema --instance sample.json sample.schema"
LICENSE = "MIT"

PV = "4.18.0"

RPM_NAME = "python39-jsonschema-4.18.0-1.1.noarch.rpm"
RPM_HASH = "281afdf59b0c2a370f824097bc499efe5b79627624fabf2dffa262fd1fb84ed8339ac698cef555a5ff7364aefd40090ac8c041e5ddc873a438ad2848e5e5afe0"
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
