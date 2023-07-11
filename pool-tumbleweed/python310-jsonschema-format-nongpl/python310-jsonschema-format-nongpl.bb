SUMMARY = "An implementation of JSON-Schema validation for Python [format-nongpl] extra"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python. \
 \
This subpackage provides the [format-nongpl] extra"
LICENSE = "MIT"

PV = "4.18.0"

RPM_NAME = "python310-jsonschema-format-nongpl-4.18.0-1.1.noarch.rpm"
RPM_HASH = "4e8fac5a6fba54fa8c0d9cbba0fefa727d98b36ad59629098f6c74596951dfc4dece007ea5fe548bc5b88f24f1d32111f7a7f71c9b4a07205a671fbec1f21c9f"
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
