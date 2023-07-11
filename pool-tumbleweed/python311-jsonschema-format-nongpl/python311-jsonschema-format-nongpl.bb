SUMMARY = "An implementation of JSON-Schema validation for Python [format-nongpl] extra"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python. \
 \
This subpackage provides the [format-nongpl] extra"
LICENSE = "MIT"

PV = "4.18.0"

RPM_NAME = "python311-jsonschema-format-nongpl-4.18.0-1.1.noarch.rpm"
RPM_HASH = "02b593ac34700ca6daa6cf5b85dc82a3cee3279797ca90411fb3a6060407c06edbb40560f9a066849443df9e6321b5be438dd7ca290712a1a9078f26e9b9749a"
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
