SUMMARY = "The JSON Schema meta-schemas and vocabularies, exposed as a Registry"
DESCRIPTION = "The JSON Schema meta-schemas and vocabularies, exposed as a Registry"
LICENSE = "MIT"

PV = "2023.7.1"

RPM_NAME = "python39-jsonschema-specifications-2023.7.1-1.1.noarch.rpm"
RPM_HASH = "485d35b676a1783cfea61179e5f1ffc3b33519a086820b8e2951673acaf37d1217a41392f0ad93c2544de724a1e283d23a46bfe435db27b1169f92e19192699f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jsonschema-specifications \
python39-jsonschema-specifications \
python3dist-jsonschema-specifications"

RDEPENDS:${PN} += "python-abi \
python39-referencing"

inherit rpm
