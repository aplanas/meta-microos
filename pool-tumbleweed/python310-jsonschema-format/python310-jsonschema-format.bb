SUMMARY = "An implementation of JSON-Schema validation for Python [format] extra"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python. \
 \
This subpackage provides the [format] extra"
LICENSE = "MIT"

PV = "4.18.3"

RPM_NAME = "python310-jsonschema-format-4.18.3-1.1.noarch.rpm"
RPM_HASH = "eddbe1c8e2db7a7309baebceeee3e651bc9c7a1df7912fc487955c0b7f47f1e874130a037894dab54b471d5b2580b0a145cce3e9392ea209fd025034da446f3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-jsonschema-format"

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
