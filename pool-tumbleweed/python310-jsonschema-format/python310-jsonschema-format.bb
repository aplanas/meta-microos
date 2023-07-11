SUMMARY = "An implementation of JSON-Schema validation for Python [format] extra"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python. \
 \
This subpackage provides the [format] extra"
LICENSE = "MIT"

PV = "4.18.0"

RPM_NAME = "python310-jsonschema-format-4.18.0-1.1.noarch.rpm"
RPM_HASH = "1d62285e971daaefaccd2b58935737c65aa5da8656b0bcb499413bd00a2cc576ceaf0521601e9d1251f1e55678acb3a7fcb88f36f744fbd245170555e67cd492"
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
