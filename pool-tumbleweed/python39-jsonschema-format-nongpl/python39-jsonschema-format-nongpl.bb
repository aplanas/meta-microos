SUMMARY = "An implementation of JSON-Schema validation for Python [format-nongpl] extra"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python. \
 \
This subpackage provides the [format-nongpl] extra"
LICENSE = "MIT"

PV = "4.18.4"

RPM_NAME = "python39-jsonschema-format-nongpl-4.18.4-1.2.noarch.rpm"
RPM_HASH = "e865e9902a4142fe07ac877e5b9d1b00135f4ee192587298fbc178966536c43370cf90429c378544ef78642ec68f5c4e7f9f630c49bbbf476f57fe6c41d9e7b1"
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
