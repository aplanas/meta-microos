SUMMARY = "The JSON Schema meta-schemas and vocabularies, exposed as a Registry"
DESCRIPTION = "The JSON Schema meta-schemas and vocabularies, exposed as a Registry"
LICENSE = "MIT"

PV = "2023.6.1"

RPM_NAME = "python310-jsonschema-specifications-2023.6.1-1.1.noarch.rpm"
RPM_HASH = "f2c0f94b9982a4656d9093bd41c35aaee63db041e2fff5aa41160e834151715a988ea6f6db9522f24481d8bdb0a86e9530a66b2013ff5e62aa13fc2a13c65136"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jsonschema-specifications \
python310-jsonschema-specifications \
python3dist-jsonschema-specifications"

RDEPENDS:${PN} += "python-abi \
python310-referencing"

inherit rpm
