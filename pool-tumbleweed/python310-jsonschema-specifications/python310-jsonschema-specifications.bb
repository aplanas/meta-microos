SUMMARY = "The JSON Schema meta-schemas and vocabularies, exposed as a Registry"
DESCRIPTION = "The JSON Schema meta-schemas and vocabularies, exposed as a Registry"
LICENSE = "MIT"

PV = "2023.7.1"

RPM_NAME = "python310-jsonschema-specifications-2023.7.1-1.1.noarch.rpm"
RPM_HASH = "710cb06a312b6e8a15ddb32741c0e712f1c8d87e062684c2b8017d1d6b2a8d9091e156bd6eeb4a75505008d1f4abaec9bb5978e15e2c01398c283c00d12b489f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jsonschema-specifications \
python310-jsonschema-specifications \
python3dist-jsonschema-specifications"

RDEPENDS:${PN} += "python-abi \
python310-referencing"

inherit rpm
