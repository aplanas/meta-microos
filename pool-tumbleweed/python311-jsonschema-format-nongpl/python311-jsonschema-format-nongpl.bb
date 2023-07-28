SUMMARY = "An implementation of JSON-Schema validation for Python [format-nongpl] extra"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python. \
 \
This subpackage provides the [format-nongpl] extra"
LICENSE = "MIT"

PV = "4.18.4"

RPM_NAME = "python311-jsonschema-format-nongpl-4.18.4-1.2.noarch.rpm"
RPM_HASH = "06012f746eb427e34447e07f5a96d5e2ca7d406a7dc2c72a81a405113b9e8a5f9f01cdeaf0646aae79609dfd28ce4211700e71f2501f5542539bef211c77c096"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsonschema-format-nongpl \
python311-jsonschema-format-nongpl"

RDEPENDS:${PN} += "python311-fqdn \
python311-idna \
python311-isoduration \
python311-jsonpointer \
python311-jsonschema \
python311-rfc3339-validator \
python311-rfc3986-validator \
python311-uri-template \
python311-webcolors"

inherit rpm
