SUMMARY = "An implementation of JSON-Schema validation for Python [format-nongpl] extra"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python. \
 \
This subpackage provides the [format-nongpl] extra"
LICENSE = "MIT"

PV = "4.18.3"

RPM_NAME = "python39-jsonschema-format-nongpl-4.18.3-1.1.noarch.rpm"
RPM_HASH = "bff3db9060535a7a93898998dabef3b737af6125c10bcb87d51d812f6c06f696a8073b017b9935b99b0f1222c392722561b68d7cf03451a8fa0a1fd7310ca5bd"
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
