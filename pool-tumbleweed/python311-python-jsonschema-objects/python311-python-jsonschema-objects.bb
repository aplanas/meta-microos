SUMMARY = "An object wrapper for JSON Schema definitions"
DESCRIPTION = "An object wrapper for JSON Schema definitions"
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python311-python-jsonschema-objects-0.4.1-3.5.noarch.rpm"
RPM_HASH = "ab31365d5969a9ca9278deb9aa6376d7ecc9c5aab6d85ca46e698b303259bbba8f9caada04ba1722d1e00d7e3ec9810936627cbc1170a15ab01f2582a1e77123"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-jsonschema-objects \
python3.11dist-python-jsonschema-objects \
python311-python-jsonschema-objects \
python3dist-python-jsonschema-objects"

RDEPENDS:${PN} += "python-abi \
python311-Markdown \
python311-inflection \
python311-jsonschema \
python311-six"

inherit rpm
