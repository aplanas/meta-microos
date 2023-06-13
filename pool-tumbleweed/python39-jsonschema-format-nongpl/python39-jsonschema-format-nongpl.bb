SUMMARY = "An implementation of JSON-Schema validation for Python [format-nongpl] extra"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python. \
 \
This subpackage provides the [format-nongpl] extra"
LICENSE = "MIT"

PV = "4.17.3"

RPM_NAME = "python39-jsonschema-format-nongpl-4.17.3-3.1.noarch.rpm"
RPM_HASH = "43d89e063515f49ef146a7d20f3115d8f4e762e79173addb88d4adc25c5624e4343ea1d321520a16b071f7bc36a15838bdd1efacf7b1cee70e7a9d80bd0bf2c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-jsonschema-format-nongpl"

RDEPENDS:${PN} += "python39-fqdn \
python39-idna \
python39-isoduration \
python39-jsonpointer \
python39-jsonschema \
python39-rfc3339-validator \
python39-rfc3986-validator \
python39-uri_template \
python39-webcolors"

inherit rpm
