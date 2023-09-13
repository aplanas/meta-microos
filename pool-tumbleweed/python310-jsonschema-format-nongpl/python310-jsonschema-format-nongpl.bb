SUMMARY = "An implementation of JSON-Schema validation for Python [format-nongpl] extra"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python. \
 \
This subpackage provides the [format-nongpl] extra"
LICENSE = "MIT"

PV = "4.18.6"

RPM_NAME = "python310-jsonschema-format-nongpl-4.18.6-2.1.noarch.rpm"
RPM_HASH = "bb192f728236213e92aabfee285f222393e5ab027cbaa7785894861cbf96ab20ad25eb5b880ef0e99f610e3cb94ae83fd9e188e23fb7d306f67d50eb0a8f3bad"
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
