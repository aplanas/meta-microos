SUMMARY = "An implementation of JSON-Schema validation for Python [format] extra"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python. \
 \
This subpackage provides the [format] extra"
LICENSE = "MIT"

PV = "4.18.6"

RPM_NAME = "python311-jsonschema-format-4.18.6-1.1.noarch.rpm"
RPM_HASH = "85842b8e8e6c1eb40dad1350e6a0da07980d9d47b4cb32bb3b1950c7fca55f1116a779dfa64ee4462fad87594dc44555643ef490cdf501dc18780d521a5673b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsonschema-format \
python311-jsonschema-format"

RDEPENDS:${PN} += "python311-fqdn \
python311-idna \
python311-isoduration \
python311-jsonpointer \
python311-jsonschema \
python311-rfc3339-validator \
python311-rfc3987 \
python311-uri-template \
python311-webcolors"

inherit rpm
