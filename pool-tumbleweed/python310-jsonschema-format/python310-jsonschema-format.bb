SUMMARY = "An implementation of JSON-Schema validation for Python [format] extra"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python. \
 \
This subpackage provides the [format] extra"
LICENSE = "MIT"

PV = "4.18.6"

RPM_NAME = "python310-jsonschema-format-4.18.6-2.1.noarch.rpm"
RPM_HASH = "85ed421594db86e9d89fcfb6300adf1854181c9a51068ee8949bf5335b52abdce88f3461b32fcc668fac57ed1b744e1a62c624df67dbdf16ae40d45d370142f0"
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
