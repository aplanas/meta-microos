SUMMARY = "An implementation of JSON-Schema validation for Python [format] extra"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python. \
 \
This subpackage provides the [format] extra"
LICENSE = "MIT"

PV = "4.17.3"

RPM_NAME = "python39-jsonschema417-format-4.17.3-1.1.noarch.rpm"
RPM_HASH = "f46974cdb5845836abc34a2b6c16acdcf08c682bdd8bfee8fefd74d4f8408e90a5e323ae2853732076c3dbf5fbb619ff5bb87b5d215fcae93220fb23895e8318"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-jsonschema-format \
python39-jsonschema417-format"

RDEPENDS:${PN} += "python39-fqdn \
python39-idna \
python39-isoduration \
python39-jsonpointer \
python39-jsonschema \
python39-rfc3339-validator \
python39-rfc3987 \
python39-uri-template \
python39-webcolors"

inherit rpm
