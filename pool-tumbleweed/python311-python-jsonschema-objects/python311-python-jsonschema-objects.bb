SUMMARY = "An object wrapper for JSON Schema definitions"
DESCRIPTION = "An object wrapper for JSON Schema definitions"
LICENSE = "MIT"

PV = "0.4.2"

RPM_NAME = "python311-python-jsonschema-objects-0.4.2-1.1.noarch.rpm"
RPM_HASH = "0bef648f19773dfca0ca4d283bf0a33ae44950cd105e8e0ce0e38d14a5fbd23034cc5d92100ca24cf18b63c1eab1db540872a0426b009b7f1f1f155ecb762004"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-jsonschema-objects \
python3.11dist-python-jsonschema-objects \
python311-python-jsonschema-objects \
python3dist-python-jsonschema-objects"

RDEPENDS:${PN} += "-python311-jsonschema >= 2.3 with python311-jsonschema < 4.18 \
python-abi \
python311-Markdown \
python311-inflection \
python311-six"

inherit rpm
