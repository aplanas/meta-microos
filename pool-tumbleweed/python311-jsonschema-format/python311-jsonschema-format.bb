SUMMARY = "An implementation of JSON-Schema validation for Python [format] extra"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python. \
 \
This subpackage provides the [format] extra"
LICENSE = "MIT"

PV = "4.18.0"

RPM_NAME = "python311-jsonschema-format-4.18.0-1.1.noarch.rpm"
RPM_HASH = "c588b3340fd7801cf6baed996d082ed1385198896ec0a570d7d1947fdb88be21534cdee0aa20ad3370c3073feddf044db3828082a7ca0dcaee483981838f7e6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsonschema-format \
python311-jsonschema-format"

RDEPENDS:${PN} += "python311-fqdn \
python311-idna \
python311-isoduration \
python311-jsonpointer \
python311-jsonschema \
python311-rfc3339-validator \
python311-rfc3987 \
python311-uri-template \
python311-webcolors"

inherit rpm
