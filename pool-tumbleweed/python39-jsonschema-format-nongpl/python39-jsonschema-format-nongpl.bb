SUMMARY = "An implementation of JSON-Schema validation for Python [format-nongpl] extra"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python. \
 \
This subpackage provides the [format-nongpl] extra"
LICENSE = "MIT"

PV = "4.18.0"

RPM_NAME = "python39-jsonschema-format-nongpl-4.18.0-1.1.noarch.rpm"
RPM_HASH = "a5d2cc7736aa5f5a534f5da821fafd9782df5a1b9a4d5e694668df971bbe95445b7c80c06c6571e59c4debcef921bed3336833529b5082cd32a4a8354218458e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-jsonschema-format-nongpl"

RDEPENDS:${PN} += "python39-fqdn \
python39-idna \
python39-isoduration \
python39-jsonpointer \
python39-jsonschema \
python39-rfc3339-validator \
python39-rfc3986-validator \
python39-uri-template \
python39-webcolors"

inherit rpm
