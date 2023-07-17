SUMMARY = "An implementation of JSON-Schema validation for Python [format] extra"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python. \
 \
This subpackage provides the [format] extra"
LICENSE = "MIT"

PV = "4.17.3"

RPM_NAME = "python310-jsonschema417-format-4.17.3-1.1.noarch.rpm"
RPM_HASH = "ce760018376bd600b2012d9200e38749e71d1a849260e7d30d0abbc8771a1ec1b1b5575fb66d3980bce54806c21b14ef8812d91a181f2172977b800c676a289d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-jsonschema-format \
python310-jsonschema417-format"

RDEPENDS:${PN} += "python310-fqdn \
python310-idna \
python310-isoduration \
python310-jsonpointer \
python310-jsonschema \
python310-rfc3339-validator \
python310-rfc3987 \
python310-uri-template \
python310-webcolors"

inherit rpm
