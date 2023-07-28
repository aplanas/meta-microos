SUMMARY = "An implementation of JSON-Schema validation for Python [format] extra"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python. \
 \
This subpackage provides the [format] extra"
LICENSE = "MIT"

PV = "4.18.4"

RPM_NAME = "python310-jsonschema-format-4.18.4-1.2.noarch.rpm"
RPM_HASH = "00663484404df692184bac8e6a875013dd88609e381bddca1de8d53fe9b75e91fb8a1d39758f5ce9702e4fc7d5c71727c6b27c93f63eb01de45535cf430e78bd"
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
