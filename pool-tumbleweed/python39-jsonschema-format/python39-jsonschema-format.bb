SUMMARY = "An implementation of JSON-Schema validation for Python [format] extra"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python. \
 \
This subpackage provides the [format] extra"
LICENSE = "MIT"

PV = "4.18.6"

RPM_NAME = "python39-jsonschema-format-4.18.6-2.1.noarch.rpm"
RPM_HASH = "e2b98046a8dabd0e7163b2838c071566fe4b226f0476692863d71842018174c58dfd12a13f1cd3e41984409703d25338b43f7a2584c90955f949be0b60583b4f"
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
