SUMMARY = "An implementation of JSON-Schema validation for Python [format-nongpl] extra"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python. \
 \
This subpackage provides the [format-nongpl] extra"
LICENSE = "MIT"

PV = "4.18.6"

RPM_NAME = "python310-jsonschema-format-nongpl-4.18.6-1.1.noarch.rpm"
RPM_HASH = "2288b8edb8ccca7da565df6451d187e045bc4e18b5b296ebc722d5d78277b519686e4e26c32979547fc1d67901aeafef0f880b099ea2114f620cae4184320043"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-jsonschema-format-nongpl"

RDEPENDS:${PN} += "python310-fqdn \
python310-idna \
python310-isoduration \
python310-jsonpointer \
python310-jsonschema \
python310-rfc3339-validator \
python310-rfc3986-validator \
python310-uri-template \
python310-webcolors"

inherit rpm
