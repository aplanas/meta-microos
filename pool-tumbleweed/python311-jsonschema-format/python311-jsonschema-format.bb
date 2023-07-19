SUMMARY = "An implementation of JSON-Schema validation for Python [format] extra"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python. \
 \
This subpackage provides the [format] extra"
LICENSE = "MIT"

PV = "4.18.3"

RPM_NAME = "python311-jsonschema-format-4.18.3-1.1.noarch.rpm"
RPM_HASH = "f7dda58dafbd5323fa0fe6cdc965ace64c9a95a2cbcbe3d6a2b19cec636370176f679d296690fed34ef16974e6360d9a7825375723336209a2a363a04537b9c6"
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
