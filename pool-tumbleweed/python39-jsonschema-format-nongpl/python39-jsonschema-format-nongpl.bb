SUMMARY = "An implementation of JSON-Schema validation for Python [format-nongpl] extra"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python. \
 \
This subpackage provides the [format-nongpl] extra"
LICENSE = "MIT"

PV = "4.18.6"

RPM_NAME = "python39-jsonschema-format-nongpl-4.18.6-1.1.noarch.rpm"
RPM_HASH = "9c69a4653f456c0d5387df1a5c1d230fa726a6d2bca9797c2f9dae1c514088585439b63ca5a7acd83c16b9891ba674736fe9a7ff764abc4f430be7fdc3bebaf7"
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
