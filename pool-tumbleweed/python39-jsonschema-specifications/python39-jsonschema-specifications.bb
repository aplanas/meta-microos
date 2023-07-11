SUMMARY = "The JSON Schema meta-schemas and vocabularies, exposed as a Registry"
DESCRIPTION = "The JSON Schema meta-schemas and vocabularies, exposed as a Registry"
LICENSE = "MIT"

PV = "2023.6.1"

RPM_NAME = "python39-jsonschema-specifications-2023.6.1-1.1.noarch.rpm"
RPM_HASH = "fae041e58fc4202e934da8aa744fd1127cc2820c072d91a572ed2448647ea7ba7843e8de44f1d4bd19253948dfd2afcd5fb6217885e3e9e613cce6597ea3d65b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jsonschema-specifications \
python39-jsonschema-specifications \
python3dist-jsonschema-specifications"

RDEPENDS:${PN} += "python-abi \
python39-referencing"

inherit rpm
