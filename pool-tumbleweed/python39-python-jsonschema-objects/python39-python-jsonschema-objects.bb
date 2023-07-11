SUMMARY = "An object wrapper for JSON Schema definitions"
DESCRIPTION = "An object wrapper for JSON Schema definitions"
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python39-python-jsonschema-objects-0.4.1-3.5.noarch.rpm"
RPM_HASH = "ae79da289d4353eaf403a6e2f1a0b8196d2871a1b9812e3b1899bdcfb6e634bb7b5d947e226245427c39b2e7952de3dc3d92c031f3b78aa15301bab392e3d0c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-jsonschema-objects \
python39-python-jsonschema-objects \
python3dist-python-jsonschema-objects"

RDEPENDS:${PN} += "python-abi \
python39-Markdown \
python39-inflection \
python39-jsonschema \
python39-six"

inherit rpm
