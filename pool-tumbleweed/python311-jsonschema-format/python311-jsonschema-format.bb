SUMMARY = "An implementation of JSON-Schema validation for Python [format] extra"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python. \
 \
This subpackage provides the [format] extra"
LICENSE = "MIT"

PV = "4.17.3"

RPM_NAME = "python311-jsonschema-format-4.17.3-3.1.noarch.rpm"
RPM_HASH = "1b77caa3aefa7cfb48d2d6def8a85dda8abe225af14e5e8506d24d75c436a1361f4fc46ae0506e4c57db3fb12a468308e1be9cadeff1a0c7ed3dd346b514c076"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-jsonschema-format"

RDEPENDS:${PN} += "python311-fqdn \
python311-idna \
python311-isoduration \
python311-jsonpointer \
python311-jsonschema \
python311-rfc3339-validator \
python311-rfc3987 \
python311-uri_template \
python311-webcolors"

inherit rpm
