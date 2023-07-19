SUMMARY = "An implementation of JSON-Schema validation for Python [format-nongpl] extra"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python. \
 \
This subpackage provides the [format-nongpl] extra"
LICENSE = "MIT"

PV = "4.18.3"

RPM_NAME = "python311-jsonschema-format-nongpl-4.18.3-1.1.noarch.rpm"
RPM_HASH = "503323d8ab29f4db73390510edb3d36a6d4f233d3cda75b593fd5494ead48599636edc0bf3fade50c47c458d712426621692597e93f960cd56704a705589ad36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsonschema-format-nongpl \
python311-jsonschema-format-nongpl"

RDEPENDS:${PN} += "python311-fqdn \
python311-idna \
python311-isoduration \
python311-jsonpointer \
python311-jsonschema \
python311-rfc3339-validator \
python311-rfc3986-validator \
python311-uri-template \
python311-webcolors"

inherit rpm
