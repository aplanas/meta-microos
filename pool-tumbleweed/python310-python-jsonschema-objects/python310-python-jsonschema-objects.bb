SUMMARY = "An object wrapper for JSON Schema definitions"
DESCRIPTION = "An object wrapper for JSON Schema definitions"
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python310-python-jsonschema-objects-0.4.1-3.5.noarch.rpm"
RPM_HASH = "9f2d6bba32bf254dbfcf4698bb2ca4f15c7cbd074e95da9da8d0f0548ab4a9d70dca8d3b266c5b9702974d123b5104ff168b0319347aa2322cb038f770f7b2d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-jsonschema-objects \
python310-python-jsonschema-objects \
python3dist-python-jsonschema-objects"

RDEPENDS:${PN} += "python-abi \
python310-Markdown \
python310-inflection \
python310-jsonschema \
python310-six"

inherit rpm
