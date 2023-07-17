SUMMARY = "An implementation of JSON-Schema validation for Python [format-nongpl] extra"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python. \
 \
This subpackage provides the [format-nongpl] extra"
LICENSE = "MIT"

PV = "4.17.3"

RPM_NAME = "python311-jsonschema417-format-nongpl-4.17.3-1.1.noarch.rpm"
RPM_HASH = "cf98aeeb1b92c6e765e71a0c41649d562f935b18afb0a21fb1ab3e03ec11f53fc83fa50169336de391a8e3419ef3069cb72b60079015cb6c10676f8f4e562a63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsonschema-format-nongpl \
python3-jsonschema417-format-nongpl \
python311-jsonschema-format-nongpl \
python311-jsonschema417-format-nongpl"

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
