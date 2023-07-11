SUMMARY = "The JSON Schema meta-schemas and vocabularies, exposed as a Registry"
DESCRIPTION = "The JSON Schema meta-schemas and vocabularies, exposed as a Registry"
LICENSE = "MIT"

PV = "2023.6.1"

RPM_NAME = "python311-jsonschema-specifications-2023.6.1-1.1.noarch.rpm"
RPM_HASH = "8d73b9efeed83662e768e3167589972adfc1bfe002e2f5cdfd4aefb93b03d3f2bf2eb320ddea5db3b6f66a903a0aaf095458b8b0f93b110cb8dc3b975ee438df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsonschema-specifications \
python3.11dist-jsonschema-specifications \
python311-jsonschema-specifications \
python3dist-jsonschema-specifications"

RDEPENDS:${PN} += "python-abi \
python311-referencing"

inherit rpm
