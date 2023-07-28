SUMMARY = "An implementation of JSON-Schema validation for Python [format] extra"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python. \
 \
This subpackage provides the [format] extra"
LICENSE = "MIT"

PV = "4.18.4"

RPM_NAME = "python311-jsonschema-format-4.18.4-1.2.noarch.rpm"
RPM_HASH = "f0eefac1ce0fef6fba6d8ce197f8a60695573e71bb2854ab2b332aa44ce7ccdc82225db9883b20388ac7440bd2e9515c7a1c269ef65d093f95896bf627e7f7bc"
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
