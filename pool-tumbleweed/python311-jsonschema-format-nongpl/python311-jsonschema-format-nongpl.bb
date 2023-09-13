SUMMARY = "An implementation of JSON-Schema validation for Python [format-nongpl] extra"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python. \
 \
This subpackage provides the [format-nongpl] extra"
LICENSE = "MIT"

PV = "4.18.6"

RPM_NAME = "python311-jsonschema-format-nongpl-4.18.6-2.1.noarch.rpm"
RPM_HASH = "59a84c596ccb39a0385d98c3269771df2c2e8c4316f38319613d3d0959fb22284a9fe6af25be30741d3f221ae2f05b84d19a5e8a04f268414d00e2eed699fa39"
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
