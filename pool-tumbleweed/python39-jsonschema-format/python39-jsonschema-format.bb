SUMMARY = "An implementation of JSON-Schema validation for Python [format] extra"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python. \
 \
This subpackage provides the [format] extra"
LICENSE = "MIT"

PV = "4.18.6"

RPM_NAME = "python39-jsonschema-format-4.18.6-1.1.noarch.rpm"
RPM_HASH = "8340ea79b36d5cf4cbeb2aa5901a18b44a87553c1e68a009a0f36fbcacd4c5c61c8c47a6ca98afd6cce6747a2fe69317ad9eb632b21df461d56e9b10f73e3bb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-jsonschema-format"

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
