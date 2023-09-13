SUMMARY = "An implementation of JSON-Schema validation for Python [format] extra"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python. \
 \
This subpackage provides the [format] extra"
LICENSE = "MIT"

PV = "4.18.6"

RPM_NAME = "python311-jsonschema-format-4.18.6-2.1.noarch.rpm"
RPM_HASH = "e020a89ca56f9f049d2c0a2952555c6da80c359358e4ddb8715a31fd0073c585b5aa475a5717b1e75177fd2762f6f200badc85a3a20ef38a1a6bbb7b88ba346b"
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
