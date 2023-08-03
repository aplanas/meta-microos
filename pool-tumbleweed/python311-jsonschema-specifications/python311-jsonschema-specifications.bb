SUMMARY = "The JSON Schema meta-schemas and vocabularies, exposed as a Registry"
DESCRIPTION = "The JSON Schema meta-schemas and vocabularies, exposed as a Registry"
LICENSE = "MIT"

PV = "2023.7.1"

RPM_NAME = "python311-jsonschema-specifications-2023.7.1-1.1.noarch.rpm"
RPM_HASH = "4d6c27c9f38eec2d80969ca6ca60016c2e0ab0bba513bb0292341772f2036c19ad4a646426ee362a24fb44004951b95988ba6956e31842b0c5e596cf74579e70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsonschema-specifications \
python3.11dist-jsonschema-specifications \
python311-jsonschema-specifications \
python3dist-jsonschema-specifications"

RDEPENDS:${PN} += "python-abi \
python311-referencing"

inherit rpm
