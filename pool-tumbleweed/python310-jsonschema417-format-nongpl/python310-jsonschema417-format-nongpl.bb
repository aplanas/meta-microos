SUMMARY = "An implementation of JSON-Schema validation for Python [format-nongpl] extra"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python. \
 \
This subpackage provides the [format-nongpl] extra"
LICENSE = "MIT"

PV = "4.17.3"

RPM_NAME = "python310-jsonschema417-format-nongpl-4.17.3-1.1.noarch.rpm"
RPM_HASH = "70cfae666b73058bd0a860c813ac68612089f48102ea429c3c9e02dcb9ee5df49dd5c557aef8ac5d809d5e89f9f2431f76fafaebe577840a390234b63f8b4e2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-jsonschema-format-nongpl \
python310-jsonschema417-format-nongpl"

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
