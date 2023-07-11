SUMMARY = "An implementation of JSON-Schema validation for Python [format] extra"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python. \
 \
This subpackage provides the [format] extra"
LICENSE = "MIT"

PV = "4.18.0"

RPM_NAME = "python39-jsonschema-format-4.18.0-1.1.noarch.rpm"
RPM_HASH = "b4a0ef7d3fdd9138876ab72ca9f66de72110065907669873e7346ed6a4c88be23eeffb4b203fc8a1b341b8336b3cd30f44291b6965edd85c6351eac7e834bcba"
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
