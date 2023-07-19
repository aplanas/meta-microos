SUMMARY = "An implementation of JSON-Schema validation for Python [format-nongpl] extra"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python. \
 \
This subpackage provides the [format-nongpl] extra"
LICENSE = "MIT"

PV = "4.18.3"

RPM_NAME = "python310-jsonschema-format-nongpl-4.18.3-1.1.noarch.rpm"
RPM_HASH = "f36a89991e6c201b698f6661638715f993883f211237a3a9ad41a9e2a43aa3a35d3da3500cd15a2215eaaaefa4a29446c9bc4c52cf65232b96c1488f3dd038c9"
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
