SUMMARY = "The JSON Schema meta-schemas and vocabularies, exposed as a Registry"
DESCRIPTION = "The JSON Schema meta-schemas and vocabularies, exposed as a Registry"
LICENSE = "MIT"

PV = "2023.5.2"

RPM_NAME = "python311-jsonschema-specifications-2023.5.2-1.1.noarch.rpm"
RPM_HASH = "ffa09959e3f6cf871709a62fe8faf92746cb71fd5fd243dd1b7411e04d70a27de0e62a961fe3bed59455369b41340fab3381b057380e5dec7cbc1e30539411d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jsonschema-specifications) \
python311-jsonschema-specifications \
python3dist(jsonschema-specifications)"
RDEPENDS:${PN} += "python(abi) \
python311-referencing"

inherit rpm
