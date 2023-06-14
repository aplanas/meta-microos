SUMMARY = "An object wrapper for JSON Schema definitions"
DESCRIPTION = "An object wrapper for JSON Schema definitions"
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python311-python-jsonschema-objects-0.4.1-3.3.noarch.rpm"
RPM_HASH = "d421be88d65c52a13158583bb8c384471207fa891ee485e492b1bd29d6004f6b8e39cf636b971a5ca3a8bbc8fcad40565e1456ea35bcd4ab3d6031bd7981db14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-python-jsonschema-objects \
python311-python-jsonschema-objects \
python3dist-python-jsonschema-objects"

RDEPENDS:${PN} += "python-abi \
python311-Markdown \
python311-inflection \
python311-jsonschema \
python311-six"

inherit rpm
