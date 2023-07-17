SUMMARY = "An implementation of JSON-Schema validation for Python [format] extra"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python. \
 \
This subpackage provides the [format] extra"
LICENSE = "MIT"

PV = "4.17.3"

RPM_NAME = "python311-jsonschema417-format-4.17.3-1.1.noarch.rpm"
RPM_HASH = "b95c48f2a715573550efd3e6c01e573af8bd8db002ff01894f8ad3ea2fd19149372ce8efa3efb09989b5cefe4e1a62239affe7b0b361db0ef93faf2c59e50329"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsonschema-format \
python3-jsonschema417-format \
python311-jsonschema-format \
python311-jsonschema417-format"

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
