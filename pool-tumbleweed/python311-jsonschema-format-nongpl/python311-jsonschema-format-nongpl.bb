SUMMARY = "An implementation of JSON-Schema validation for Python [format-nongpl] extra"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python. \
 \
This subpackage provides the [format-nongpl] extra"
LICENSE = "MIT"

PV = "4.18.6"

RPM_NAME = "python311-jsonschema-format-nongpl-4.18.6-1.1.noarch.rpm"
RPM_HASH = "0d4eb5dfc71c281840b11fb817cd4aa0e1eeac978f3556b7c5add3d181556e12469ad7d3673797fb9c8694a2ee1f49b9c2d30964632b86cf1073a79e6bbacb50"
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
