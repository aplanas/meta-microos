SUMMARY = "An implementation of JSON-Schema validation for Python [format-nongpl] extra"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python. \
 \
This subpackage provides the [format-nongpl] extra"
LICENSE = "MIT"

PV = "4.18.4"

RPM_NAME = "python310-jsonschema-format-nongpl-4.18.4-1.2.noarch.rpm"
RPM_HASH = "b6c72f8876d3df89f4a11632aa41cd5dfcb5fe4c0b1e080e7835df01379ffa9b109c4e242c2a2ee6e43bef602134e42cf7b801e6cc79982ab795d1af975662e7"
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
