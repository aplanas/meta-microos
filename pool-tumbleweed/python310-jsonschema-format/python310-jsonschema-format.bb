SUMMARY = "An implementation of JSON-Schema validation for Python [format] extra"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python. \
 \
This subpackage provides the [format] extra"
LICENSE = "MIT"

PV = "4.18.6"

RPM_NAME = "python310-jsonschema-format-4.18.6-1.1.noarch.rpm"
RPM_HASH = "5578a3b3b667aecbb2dff9cdea7e7506be30164263b7443baa35d4bcb63f8b52c3fcc4087d2f40bc1c72d0491f3f0362c4df56f8ae72de4415df28b6fb82d48e"
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
