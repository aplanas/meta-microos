SUMMARY = "An implementation of JSON-Schema validation for Python [format] extra"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python. \
 \
This subpackage provides the [format] extra"
LICENSE = "MIT"

PV = "4.17.3"

RPM_NAME = "python39-jsonschema-format-4.17.3-3.1.noarch.rpm"
RPM_HASH = "d85e14117f5f1fdcfd20a099528a5b42d2d32d8c29252588b1bfbeba72befc092e38eb2748b40105335b53bdf38297fd18ec2a79381c550f70dbc8154701b5af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-jsonschema-format"

RDEPENDS:${PN} += "python39-fqdn \
python39-idna \
python39-isoduration \
python39-jsonpointer \
python39-jsonschema \
python39-rfc3339-validator \
python39-rfc3987 \
python39-uri_template \
python39-webcolors"

inherit rpm
